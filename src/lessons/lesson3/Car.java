package lessons.lesson3;

public class Car {
    private String brand;
    private CarTypes carTypes;
    private Engin engin;

    public Car() {
    }

    public Car(String brand, CarTypes carTypes, Engin engin) {
        this.brand = brand;
        this.carTypes = carTypes;
        this.engin = engin;
    }

    public String getBrand() {
        return brand;
    }

    public CarTypes getCarTypes() {
        return carTypes;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarTypes(CarTypes carTypes) {
        this.carTypes = carTypes;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carTypes=" + carTypes +
                ", engin=" + engin +
                '}';
    }

    public void startCar(){
        engin.startEngine();
        System.out.println("Car started");
    }
}
