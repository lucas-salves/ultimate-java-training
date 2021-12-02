package StringMatches1d030945;

public class StringMatches {

    public static void main(String[] args) {
        
        String telefone = "11956321514";
        boolean telefoneValidation = telefone.matches("[0-9]{11}");
        System.out.println(telefoneValidation);
    }
    
}
