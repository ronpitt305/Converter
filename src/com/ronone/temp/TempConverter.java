package com.ronone.temp;


public class TempConverter {

    public double celsiusToFahrenheit(double x){
        double y = 9/5;
        double fahrenheitToCelsius = (x*y)+32;
        return fahrenheitToCelsius;
    }

    public double celsiusToKelvin(double x){
        double kelvinToCelsius = x+273.15;
        return kelvinToCelsius;
    }

    public double fahrenheitToCelsius(double x){
        double y = 5/9;
        double celsiusToFahrenheit = (x-32)*y;
        return celsiusToFahrenheit;
    }

    public double fahrenheitToKelvin(double x){
        double y = 5/9;
        double kelvinToFahrenheit = (x + 459.67)*y;
        return kelvinToFahrenheit;
    }


}
