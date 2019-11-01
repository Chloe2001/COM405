/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author 4chasc78
 */
public class User {
    
    private String car;
    int numSpaces = 15;
    int capacity = 15;
    boolean isFull = false;
    int count = 1;
    
    {   
    if(isFull == false)
    {
        if(numSpaces < capacity )
        {
            System.out.println("The car park has " + numSpaces);
        }
        else
        {
            System.out.println("Sorry, the car park is at full capacity.");
        }
    }
        
     while (count < 15)
     {
         System.out.println("The car park has" + count + "spaces left");
         count++;
     }
        System.out.println("The car has been added to the car park");
        
        
        
    }
   

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getNumSpaces() {
        return numSpaces;
    }

    public void setNumSpaces(int numSpaces) {
        this.numSpaces = numSpaces;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isIsFull() {
        return isFull;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}



