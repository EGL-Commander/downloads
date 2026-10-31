import java.util.*;
public class UDDIRegistryDemo {
 static class Service { String name, business, endpoint; Service(String n,String b,String e){name=n;business=b;endpoint=e;} }
 public static void main(String[] args) {
  Map<String,Service> registry=new HashMap<>();
  Service travel=new Service("TravelBooking","ABC Travels","http://localhost:8080/travel");
  registry.put(travel.name,travel); // Publish
  System.out.println("Published: "+travel.name);
  Service found=registry.get("TravelBooking"); // Find
  if(found!=null) System.out.println("Discovered service: "+found.name+" | Provider: "+found.business+" | Endpoint: "+found.endpoint);
  registry.remove("TravelBooking"); // Unpublish
  System.out.println("Service removed. Registry size: "+registry.size());
 }
}
