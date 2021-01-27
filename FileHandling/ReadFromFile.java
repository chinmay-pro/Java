package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\chinm\\IdeaProjects\\Java\\src\\com\\FileHandling\\CreateFile.txt");
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
    }
}
