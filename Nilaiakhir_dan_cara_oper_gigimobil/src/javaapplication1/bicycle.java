/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO3;
class Bicycle{
 int speed = 0;
int gear = 0;

void changeGear (int newValue)
{
    gear = gear +newValue;
    System.out.println("\n Gear:"+gear);
    
}
void speedUp(int increment)
{
    speed =speed +increment;
    System.out.println("\n speed:" + speed);
}




/**
 *
 * @author E
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.speed=10;
        bike.gear=2;
        
        // TODO code application logic here
        bike.speedUp(10);
        bike.changeGear(2);
    
    
}
}