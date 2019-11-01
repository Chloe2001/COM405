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
public class Bus {
    
int maximumPassengers = 15;

private Passenger[] seats;

public Bus (int maximumPassengers) 
{
    this.maximumPassengers = maximumPassengers;
    seats = new Passenger[maximumPassengers];
    
}

public boolean addPassenger (Passenger passengerIn)
{
    for(int i = 0; i<seats.length -1; i++) 
    {
        if (seats[i] ==null)
                {
                    seats[i] = passengerIn;
                    return true;
                }
    }
    return false;
    }
public boolean removePaddenger (int id)
{
    for (int i=0; i<seats.length, i++)
    {
        if(seats[i] 1 = null)
        {
            if(seats[i].getId() == id)
            {
                seats[i] = null;
               
            }
        }
    }
    
    public Passenger getPassenger()
   {
    for (int i=0; i<seats.length, i++)
    {
        if(seats[i] 1 = null)
        {
            if(seats[i].getId() == id)
            {
                seats[i] = [i];
               
            }
        }
    }
    return null;
}
}



           
  
 
 
 
