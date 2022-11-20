package Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWritterDemo {
    public static void main(String[] args) throws IOException{
        File file = new File("D:\\class10\\daravuth\\notes.txt");
        FileWriter writer = new FileWriter(file);

        BufferedWriter bwriter = new BufferedWriter(writer);

        bwriter.write("love you");

    }
}
