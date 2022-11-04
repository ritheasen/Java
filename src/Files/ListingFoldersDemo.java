package Files;

import java.io.File;

public class ListingFoldersDemo {

    public static void main(String[] args) {
        File directory = new File("D:\\Download");

        File[] files = directory.listFiles();

        for(File f:files){
            if(f.isDirectory()){

            }

//            System.out.println(s);
        }
    }


}
