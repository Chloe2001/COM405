/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.pkg2;

/**
 *
 * @author 4Chasc78
 */
public class Dog {

    private Heart heart;
//attributes 
    private String name;
    private int weight;
    private int energy;
    private int hunger;
    private boolean isGood;

    public Dog(String nameIn, int weightIn) {
        name = nameIn;
        weight = weightIn;
        energy = 100;
        hunger = 50;
        isGood = true;
        heart = new Heart(60);
    }

    public void walk() {
        if(heart.increaseBPM(5))
        {
        weight--;
        energy--;
        heart.increaseBPM(5);

    }
        else
        {
            System.out.println("The dog is under too much strain");
        }
    }
    public void sleep() {
        energy = 100;
        hunger--;
        heart.setRestingRate(60);

    }

    public void eat() {
        hunger = 100;
        weight++;
    }

    public String getName() {
        return name;

    }

    public int getWeight() {
        return weight;
    }

    public int getEnergy() {
        return energy;

    }

    public int getHunger() {
        return hunger;
    }

    public boolean hasBeenGood() {
        return isGood;
    }
}
