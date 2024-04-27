package sysAdmin;

import java.util.ArrayList;
import java.util.Scanner;

public  class   CompanyStock implements Imanager{
    public ArrayList<Car> carStock=new ArrayList<>();

    public void addtoStock(Car car){
        carStock.add(car);
    }


    @Override
    public void listingVehiles() {
        System.out.println("---Brand---Category of car---Manufacturer");
            for(Car car: carStock){
                System.out.println("|-"+car.getBrand()+"---"+car.getCategoryOfCar()+"---"+car.getManufacturer()+"-|");
            }
    }

    @Override
    public Car findCar(String name) {
        for (Car car:carStock){
            if(name.equals(car.getBrand())){
                System.out.println("|-"+car.getBrand()+"---"+car.getCategoryOfCar()+"---"+car.getManufacturer()+"-|");
                return car;
            }
        }
        return null;
    }

    @Override
    public void PriceRangeListingCars(double lowestAmount, double highest) {
        for (Car car:carStock){
            if(car.getPrice()>lowestAmount&&car.getPrice()<highest){
                System.out.println("|-"+car.getBrand()+"---"+car.getCategoryOfCar()+"---"+car.getManufacturer()+"-|");
            }
        }

    }

    @Override
    public void discountedCars() {

        for (Car car:carStock){
            if (car.getDiscountByBrand()>0.00){
                System.out.println("|-"+car.getBrand()+"---"+car.getCategoryOfCar()+"---"+car.getManufacturer()+"-|");
            }
        }

    }

    @Override
    public void setDiscounts() {
        Scanner input=new Scanner(System.in);
        for (Car car:carStock){
            System.out.println("Set discount for"+car.getBrand()+"---"+car.getCategoryOfCar());
            car.setDiscountByBrand(input.nextFloat());
        }

    }
}
