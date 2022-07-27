package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAtributeTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAcessTime = basicFileAttributes.lastAccessTime();

        System.out.println("crestion time"+creationTime);
        System.out.println("lastModiefiedTime"+lastModifiedTime);
        System.out.println("lastAcess time"+lastAcessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path,BasicFileAttributeView.class);
        FileTime newXCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,newXCreationTime,creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAcessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("crestion time"+creationTime);
        System.out.println("lastModiefiedTime"+lastModifiedTime);
        System.out.println("lastAcess time"+lastAcessTime);
    }
}
