package org.example;

import Customer.Customer;
import sysAdmin.Car;
import sysAdmin.CompanyStock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CompanyStock before_Us=new CompanyStock();
        //Register cars for the business
        String[] carNames={"Mercedes","Toyota","Audi","mazda","ford","buggati"};
        String[] categories={"Bus","truck","pickup","mini-cooper","bobcat"};
        String[] color={"blue","red","pink","orange","yellow"};

        for (int i = 0; i < 5; i++) {
          before_Us.addtoStock(new Car(carNames[i],carNames[i],categories[i],true,carNames[i]+color[i],(i+i)*2000,color[i],(i*i)+300,(i+2)*300,i+1,60+(i*2),true,false));     }

        before_Us.listingVehiles();

        Customer joseph=new Customer("jack","malawi","jack@yahoo.mail");

        joseph.makeOrder(new Car(carNames[0],carNames[0],categories[0],true,carNames[0]+color[0],(0+0)*2000,color[0],(0*0)+300,(0+2)*300,0+1,60+(0*2),true,false),"20-06-2022",before_Us.carStock);
        before_Us.listingVehiles();
    }
}