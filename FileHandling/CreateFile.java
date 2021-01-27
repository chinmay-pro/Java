package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("C:\\Users\\chinm\\IdeaProjects\\Java\\src\\com\\FileHandling\\CreateFile.txt");
            if (myObj.createNewFile()){
                System.out.println("File created : "+ myObj.getName());
            }else{
                System.out.println("File already Exists.");
            }
        }catch (IOException e){
            System.out.println("An Error occurred.");
            e.printStackTrace();
        }
    }
}
