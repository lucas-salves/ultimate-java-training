package ReadingAJsonFileAndDeserializesItIntoAJavaObject9b9902e0;

import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonFIleToJavaObject {
    public static void main(String[] args) throws IOException {
        var gson = new GsonBuilder().setPrettyPrinting().create();
        
        var json = Paths.get("filename.json");
        
        var reader = Files.newBufferedReader(json);
        
        var deserializedObject = gson.fromJson(reader,Person.class);
        
        reader.close();
        
        Person person = new Person();
    }
    
    public static class Person {
        private String name;
        
        private int age;
    }
}
