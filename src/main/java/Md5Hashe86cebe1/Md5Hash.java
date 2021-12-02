package Md5Hashe86cebe1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.InputMap;

public class Md5Hash {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        
        byte[] messageDigest = digest.digest("String".getBytes());
        
        BigInteger no = new BigInteger(1,messageDigest);
        
        String hashText = no.toString(16);
        
        while ( hashText.length() < 32 ) {
            hashText = "0"+hashText;
            
        }
        
        System.out.println(hashText);
    }
    
}
