package Files;

import java.io.File;
import java.io.IOException;

public class fileDemo {
    public static void main(String[] args) {

        File Files = new File("D:\\class10\\daravuth\\notes.txt");
        File newFile = new File("D:\\class10\\daravuth\\notesForVuth.txt");
        if(!Files.exists()){
            //Files.mkdirs();

//            try {
//                Files.createNewFile();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

                Files.renameTo(newFile);

            System.out.println("file rename");
        }else{
            System.out.println("file already presented.");
        }




    }
}
