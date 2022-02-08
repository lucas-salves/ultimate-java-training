package StringLengthAndCharacterValidation1d030945;

public class MathchesExample {
    
    public static void main(String[] args) {
        
        String string = "A2daa";
        
        boolean valid = string.matches("[A-Za-z0-9]{5,}");
        
        System.out.println(valid);
        
    }
        
}
