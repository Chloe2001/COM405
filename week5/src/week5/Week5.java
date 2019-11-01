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
public class Week5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
      Bus b1 = new Bus(15);
    Passenger p1 = new Passenger();
    int maximumPassenger = 15;
    
    b1.addPassenger(p1);
    for (int i = 0;i< maximumPassenger-1; i++) 
    {
        b1.addPassenger(p1);
        p1.getName();
        p1.getAge();
        p1.getFairPaid();
    }
    b1.addPassenger (new Passenger(1, "meh", 25, 5.00));
       b1.addPassenger (new Passenger(2, "meh", 45, 5.00));
       b1.addPassenger (new Passenger(3, "meh", 16, 5.00));
    
       
       
       
       if (b1.addPassenger (new Passenger(4, "lalala",60,5.0)))
       {
           System.out.println("Added");
           
       }
       else
       {
           system.out.println("Bus is full");
       }
       if (b1.removePassenger(4))
       {
           System.out.println("Passenger does not exixt");
           System.out.println("Name" + pass.getName());
       }
    }
    
}

    
   
   
    

