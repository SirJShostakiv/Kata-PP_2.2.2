package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import app.service.CarServiceImpl;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {
        if (count == null || count >= 5) {
            model.addAttribute("count", CarServiceImpl.carList);
            return "cars";
        }
        model.addAttribute("count", new CarServiceImpl().getCars(count));
        return "cars";
    }
}
