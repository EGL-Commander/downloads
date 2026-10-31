package org.example;
import jakarta.xml.ws.Endpoint;
public class Server {
 public static void main(String[] args) {
  Endpoint.publish("http://localhost:8080/temperature",new TemperatureImpl());
  System.out.println("SOAP service: http://localhost:8080/temperature?wsdl");
 }
}
