/*Polymorphism:
 *A DeliveryBoys[Postman]Deliverd Letter,
 *A DeliveryBoYS[Zamato]Deliverd Fooood
 *A DeliveryBoys[flipkart]Deliverd parsal
 */
package com.journaldev;
import java.util.Random;

class DeliveryBoy
{
    void deliver()
    {
        System.out.println("Delivering Item");
    }
    public static void main(String[]args)
    {
        DeliveryBoy db=  getDeliveryBoy();
        db.deliver();
    }
    private static DeliveryBoy getDeliveryBoy()
    {
        Random rand = new Random();
        int num = rand.nextInt(10);
        return num %2 == 0 ? new PizzaDeliveryBoy():new Postman();
    }
}
class PizzaDeliveryBoy extends DeliveryBoy
{
   // @override
    void deliver()
    {
        System.out.println("Delivering Pizza");
    }
}
class Postman extends DeliveryBoy
{
//    @override
    void deliver()
    {
        System.out.println("Delivering Letters");
    }
}
