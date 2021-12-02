package TempFile2f29e7f5;

import java.io.File;
import java.io.IOException;

public class TempFile {

    public static void main(String[] args) throws IOException {
        File tempFile = File.createTempFile("prefix-", "-suffix");
        tempFile.deleteOnExit();
    }
    
}
