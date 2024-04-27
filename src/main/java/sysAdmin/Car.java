package sysAdmin;

public class Car {
    private String brand;
    private String make;
    private String categoryOfCar;
    private boolean rightHand;
    private String manufacturer;
    private int year;
    private String color;
    private double engineSize;
    private double price;
    private int seats;
    private double mileage;
//    private double discount;
    private boolean manual;
    private boolean electric;
    private float discountByBrand;


    public Car(String brand, String make, String categoryOfCar, boolean rightHand, String manufacturer, int year, String color, double engineSize, double price, int seats, double mileage, boolean manual, boolean electric) {
        this.brand = brand;
        this.make = make;
        this.categoryOfCar = categoryOfCar;
        this.rightHand = rightHand;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.price = price;
        this.seats = seats;
        this.mileage = mileage;
        this.manual = manual;
        this.electric = electric;
        this.discountByBrand = 0;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategoryOfCar() {
        return categoryOfCar;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getDiscountByBrand() {
        return discountByBrand;
    }

    public void setDiscountByBrand(float discountByBrand) {
        this.discountByBrand = discountByBrand;
    }

}
