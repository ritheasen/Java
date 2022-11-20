package Files;

import javax.annotation.processing.Filer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\class10\\daravuth\\notes.txt");
        FileReader reader = new FileReader(file);
        BufferedReader breader = new BufferedReader(reader);

        String newLine = breader.readLine();

        while(newLine != null){
            System.out.println(newLine);
            newLine = breader.readLine();
        }
    }
}
