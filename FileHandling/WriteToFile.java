package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words");
        String str = sc.nextLine();
        try {
            FileWriter myObj = new FileWriter("C:\\Users\\chinm\\IdeaProjects\\Java\\src\\com\\FileHandling\\CreateFile.txt");
            myObj.write(str);
            myObj.close();
            System.out.println("File wrote successfully.");
        } catch (IOException e) {
            System.out.println("An Error Occurred.");
            e.printStackTrace();
        }
    }
}
