package DownloadFile519331c7;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

public class DownloadFIle {

    public static void main(String[] args) throws IOException {
        String stringUrl = "https://inforchannel.com.br/wp-content/uploads/2021/03/e2d2f80e-java-logo-1-1536x860.png.webp";
        File file = new File("x.png.webp");       
        
            URL url = new URL(stringUrl);
            FileUtils.copyURLToFile(url, file);
    }
    
}
