package ConvertBase64ToPDF1364cd37;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class ConvertBase64ToPDF {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("./test.pdf");
        
        try(FileOutputStream fos = new FileOutputStream(file);){
            String b64 = "";
            byte[] decoder = Base64.getDecoder().decode(b64);
            
            fos.write(decoder);
            System.out.println("PDF File Saved");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
