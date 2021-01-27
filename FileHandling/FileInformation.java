package FileHandling;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\chinm\\IdeaProjects\\Java\\src\\com\\FileHandling\\CreateFile.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path : " + myObj.getAbsolutePath());
            System.out.println("Writeable : " + myObj.canWrite());
            System.out.println("Readable : " + myObj.canRead());
            System.out.println("File Size in Bytes : " + myObj.length());
        }else{
            System.out.println("File doesn't Exists.");
        }
    }
}
