package VarArgsParameters257c5094;

public class VarArgsParameters {
    public static void main(String[] args) {
        teste("a"); // a recebe "a" e b fica vazio
        teste("a", 1,2 ); // a recebe "a", b recebe {1,2}
    }
    
    public static void teste(String a, Integer... b){
        //...
    }
}
