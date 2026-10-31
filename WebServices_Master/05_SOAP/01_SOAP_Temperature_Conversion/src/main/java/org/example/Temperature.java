package org.example;
import jakarta.jws.*;
@WebService
public interface Temperature {
 @WebMethod double celsiusToFahrenheit(double c);
 @WebMethod double fahrenheitToCelsius(double f);
}
