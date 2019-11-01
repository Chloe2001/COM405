/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author 4Chasc78
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Car car = new Car();

        car.setCurrentSpeed(20);
        int currentSpeed = car.getCurrentSpeed();
        System.out.println(currentSpeed);

        if (currentSpeed <= 20) {
            System.out.println("accelerate ");
        } else {
            System.out.println("Decrease speed");
        }
        Car c1 = new Car();
        Car c2 = new Car();

        
        c1.setName("Mazda");
        c1.setAccelerate(70);
        c1.setDoors(5);
        c1.setCurrentSpeed(30);
        c1.setFuelLevel(100);
        c1.setMaxSpeed(120);
        
        System.out.println("The name is of this car is "+ c1.getName());
        System.out.println("the nummber of doors this car has is " + c1.getDoors());
        System.out.println("The current speed of this car is " + c1.getCurrentSpeed());
        System.out.println("The fuel level of this car is " + c1.getFuelLevel());
        System.out.println("The maximum speed of this car is " + c1.getMaxSpeed());
        
        c1.accelerate();
        c1.brake();
        
       c2.setName("Bently");
        c2.setAccelerate(90);
        c2.setDoors(3);
        c2.setCurrentSpeed(50);
        c2.setFuelLevel(50);
        c2.setMaxSpeed(150);
        
        System.out.println("The name is of this car is "+ c2.getName());
        System.out.println("the nummber of doors this car has is " + c2.getDoors());
        System.out.println("The current speed of this car is " + c2.getCurrentSpeed());
        System.out.println("The fuel level of this car is " + c2.getFuelLevel());
        System.out.println("The maximum speed of this car is " + c2.getMaxSpeed()); 
        
     c2.accelerate();
     c2.brake();
     
  
        
    }
}
