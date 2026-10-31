package org.example;
import jakarta.jws.WebService;
@WebService(endpointInterface="org.example.Temperature")
public class TemperatureImpl implements Temperature {
 public double celsiusToFahrenheit(double c){ return c*9/5+32; }
 public double fahrenheitToCelsius(double f){ return (f-32)*5/9; }
}
