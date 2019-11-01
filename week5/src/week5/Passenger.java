/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author 4chasc78
 */
public class Passenger {
    private String name;
    private int age;
    private double farePaid;
    private int id;
    
    
    
    public Passenger(int idIn, String nameIn, int ageIn, double farePaid)
    {
        id= idIn;
        name = nameIn;
        age =ageIn;
        farePaid = fareIn;
    }
    
    
    
    
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFarePaid() {
        return farePaid;
    }

    public void setFarePaid(double farePaid) {
        this.farePaid = farePaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    
    
    
}
