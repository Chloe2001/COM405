package week3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4Chasc78
 */
public class Car {
    
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;
    private String colour;
    private String numberPlate;
    private String name;
    private String Colour;
    private int doors;
    private int accelerate;
    private int brake;
    private int refuel;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
    }

    public int getBrake() {
        return brake;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public int getRefuel() {
        return refuel;
    }

    public void setRefuel(int refuel) {
        this.refuel = refuel;
    }
    
    public void setCurrentSpeed(int currentSpeed) {
        
      
       this.currentSpeed = currentSpeed;
       }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    
    
    

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    
    
    
    

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    
    
    
    
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
 
    
    
    
    
    
    
    
    
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public String getColour() {
        return colour;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void accelerate()
    {
        if (currentSpeed > 70 && fuelLevel < 70)
        {
            accelerate++;
            currentSpeed++;
            fuelLevel--;    
        }
        brake--;
        refuel++;
       
    }
    public void brake()
    {
        if (currentSpeed > 90 && fuelLevel < 60)
        {
            accelerate--;
            currentSpeed--;
            fuelLevel--;
        }
        brake++;
        refuel++;
    }
            
}
        


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


