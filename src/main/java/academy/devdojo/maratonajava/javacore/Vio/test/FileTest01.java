package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {

        File arquivo = new File("file.txt");

            try {
                boolean isCreated = arquivo.createNewFile();
                System.out.println("Created "+isCreated);
                System.out.println("path "+arquivo.getPath());
                System.out.println("path absolute "+arquivo.getAbsolutePath());
                System.out.println("is Directory "+arquivo.isDirectory());
                System.out.println("is File"+arquivo.isFile());
                System.out.println("is FHidden"+arquivo.isHidden());
                System.out.println("is last modified"+ Instant.ofEpochMilli(arquivo.lastModified()).atZone(ZoneId.systemDefault()));
                boolean exists = arquivo.exists();
                if (exists) {
                    System.out.println("Deleted " + arquivo.delete());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
