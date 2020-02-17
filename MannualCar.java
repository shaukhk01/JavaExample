package com.Abstraction;

public class MannualCar implements AbstractionInterface
{
    private String cartype = "Mannual";//internal implements can't access outside directly
//    @Override
    public void turnOnCar()
    {
        System.out.println("trun on the mannual car");
    }
 //   @Override
    public void turnOffCar()
    {
        System.out.println("turn off the mannual car");
    }
    public String getCarType()
    {
        return this.cartype;
    }
}
