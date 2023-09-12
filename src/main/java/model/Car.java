package model;

public class Car {
    private final String model;
    private final String series;
    private final int manufacturingYear;
    public Car(String model, String series, int manufacturingYear) {
        this.model = model;
        this.series = series;
        this.manufacturingYear = manufacturingYear;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }
}
