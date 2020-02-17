package com.Abstraction;
public class Execute
{
    public static void main(String[]args)
    {
        AbstractionInterface ai = new MannualCar();
        ai.turnOnCar();
        ai.turnOffCar();
        System.out.println(ai.getCarType());
    }
}

