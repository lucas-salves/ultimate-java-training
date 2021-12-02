package FileToBase640cb65403;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class FileToBase64 {

    public static void main(String[] args) throws IOException {
        File file = new File("x.png.webp");
        System.out.println(FileToBase64.encodeFileToBase64( file ));
    }
    
    private static String encodeFileToBase64(File file) throws IOException{
        try{
            byte[] fileContent = Files.readAllBytes(file.toPath());
            return Base64.getEncoder().encodeToString(fileContent);
        }catch(IOException e){
            throw  new IllegalStateException("could not read file"+file,e);
        }
    }
    
}
