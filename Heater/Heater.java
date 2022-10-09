
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables
    private double temperature;
    private double min;
    private double max;
    private double increment;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double tempMin, double tempMax)
    { 
        // initialise instance variables
        temperature = 15.0;
        min = tempMin;
        max = tempMax;
        increment = 5.0;
    }

    public void warmer ()
    {
        if (temperature < max)
        {
            temperature = temperature + increment;
        }
        else
        {
            System.out.println("Temperature not allowed to be greater than: " + max);
        }
    }

    public void cooler ()
    {
        if (temperature > min)
        {
            temperature = temperature - increment;
        }
        else
        {
            System.out.println("Temperature not allowed to be less than: " + min);
        } 
    }

    public double returnTemperature()
    {
        return temperature;
    }
}
