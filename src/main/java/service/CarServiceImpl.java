package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    static Car car1 = new Car("BMW", "M5", 1985);
    static Car car2 = new Car("Audi", "A3", 1996);
    static Car car3 = new Car("Ford", "Mustang", 1964);
    static Car car4 = new Car("Hyundai", "Elantra", 2023);
    static Car car5 = new Car("Lada", "Vesta", 2022);

    public static final List<Car> carList = List.of(car1, car2, car3, car4, car5);
    @Override
    public List<Car> getCars(int count) {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(carList.get(i));
        }
        return list;
    }
}
