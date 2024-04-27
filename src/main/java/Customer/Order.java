package Customer;

import sysAdmin.Car;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private Car car;
    private String date;
    private double shipping=200;
    private double portClearance=150;
    private double discount=0.01;

    public Order(Customer customer, Car car, String date) {
        this.customer = customer;
        this.car = car;
        this.date = date;
    }

    public double totalPurchase(ArrayList <Car> carStock){
        double totalDiscount=(customer.getDiscount()*car.getPrice())+(car.getPrice()*discount);
        carStock.remove(car);
        customer.getCarsBought().add(car);
        return car.getPrice()-totalDiscount;
    }
}
