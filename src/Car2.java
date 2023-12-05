import java.util.ArrayList;
import java.util.stream.Collectors;

public class Car2 {
    private String brand;
    private String model;
    private int year;

    public Car2() {
    }

    public Car2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    static ArrayList<Car2> getCarsAfterYear(ArrayList<Car2> cars, int year){
        return (ArrayList<Car2>) cars.stream().filter(s-> s.year > year).collect(Collectors.toList());
    }
}
