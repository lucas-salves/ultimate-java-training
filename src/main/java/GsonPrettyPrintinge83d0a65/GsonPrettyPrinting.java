package GsonPrettyPrintinge83d0a65;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonPrettyPrinting {

    public static void main(String[] args) {
        var gson = new GsonBuilder().setPrettyPrinting().create();

        //Convert an object to a Json string
        String json = gson.toJson(new Person());
        
        System.out.println(json);
    }

    public static class Person {

        private String name = "Luscão";

        private int age = 23;

    }
}
