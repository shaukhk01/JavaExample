package com.Abstraction;
public class Execute
{
    public static void main(String[]args)
    {
        AbstractionInterface ai = new MannualCar();
        ai.turnOnCar();
        ai.turnOffCar();
        System.out.println(ai.getCarType());
        /*here you can see in CLIENT program only know about Car  and car function
         *car provides The internal implementation details are hidden from client program.
         */
    }
}

