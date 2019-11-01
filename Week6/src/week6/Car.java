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
public class Car {
    private String numberplate;
private String car;
    int numSpaces = 15;
    int capacity = 15;
    boolean isFull = false;
    int count = 1;
    private User assignedUser;
    
    private User[] cars;
    
    public Car (int numspaces) {
        this.numSpaces = numSpaces;
        cars=new User[numSpaces];
        
    }
    public boolean add User ( User userIn) {
        for (int i = 0; i < cars.length -1; i++)
            
        
    }
    
    
    
    


    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
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
    
    
    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }
}



  
