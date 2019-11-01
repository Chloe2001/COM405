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
public class Seats {
private int seatNumber;

    public int getSeatNumber() {
        return seatNumber;
    }

           
    private Seats[] seatsPassenger;
    
    public Seats()
    {
        seatsPassenger = new Seats[30];
    }
    
    public boolean addSeats (Seats seatIn)
    {
        for (int i = 0; i < seatsPassenger.length; i++)
        {
            if (seatsPassenger[i] == null)
            {
                seatsPassenger[i] = seatIn;
                return true;
            }
        }
        return false;
    }
    public boolean removeSeats (int numberIn)
    {
        for (int i = 0; i< seatsPassenger.length; i++)
        {
            if (seatsPassenger[i] !=null)
            {
                int seatNumber = seatsPassenger[i].getNumber();
                
                if (seatNumber = numberIn)
                {
                    seatsPassenger[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    
    
}
