package Customer;

import sysAdmin.Car;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Car> carsBought=new ArrayList<>();
    private String name;
    private String country;
    private String email;
    private double discount;

    public Customer(String name, String country, String email) {
        this.name = name;
        this.country = country;
        this.email = email;
        this.discount = 0.02; // 2% discount for new customers
    }

    public double getDiscount() {
        return discount;
    }

    public ArrayList<Car> getCarsBought() {
        return carsBought;
    }

    public void makeOrder(Car car,String date,ArrayList<Car> stock){
        Order order=new Order(this,car,date);
        order.totalPurchase(stock);
    }

}
