package GsonPrettyPrintinge86cebe1;

import com.google.gson.GsonBuilder;

public class JsonPrettyPrinting {
        
        
    public static void main(String[] args) {
        Person p = new Person();
        
        
        p.setName("Lusca");
        
        p.setAge(23);
        
        p.jsonToObject("{'name':'Luscão', 'age':23}");
        
        System.out.println(p.objToJson(p));
        
        
    }
    
    
    
    public static class Person{
        private String name;
        private int age;
        
        public Person(){
            
        }
        
        public String getName(){
            return this.name;
        }
        
        public int getAge(){
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        
        public  void jsonToObject(String json){
        var gson = new GsonBuilder().setPrettyPrinting().create();
        Person person = gson.fromJson(json, Person.class);
        
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
    
    public  String objToJson(Person person){
        var gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);
        return json;
    }
    }
}





