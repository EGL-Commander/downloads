package org.example;
import java.nio.file.*;
import org.json.*;

public class ReadJSON {
 public static void main(String[] args) throws Exception {
  JSONObject root = new JSONObject(Files.readString(Path.of("data.json")));
  JSONArray products = root.getJSONArray("products");
  for (int i=0; i<products.length(); i++) {
   JSONObject p = products.getJSONObject(i);
   System.out.println(p.getInt("id")+" "+p.getString("name")+" "+p.getDouble("price"));
  }
 }
}
