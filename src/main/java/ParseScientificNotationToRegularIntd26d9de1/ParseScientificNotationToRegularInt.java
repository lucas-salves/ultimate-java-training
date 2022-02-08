package ParseScientificNotationToRegularIntd26d9de1;

public class ParseScientificNotationToRegularInt {
    
    public static void main(String[] args) {
        String string = "1.2456967959E10".replace(".", "").split("E")[0];
        System.out.println(string);
    }
}
