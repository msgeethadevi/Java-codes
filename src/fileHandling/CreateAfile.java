package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAfile {
    public static void main(String[] args) {

        try {
            File object = new File("C:\\Users\\geeth\\IdeaProjects\\GeethaFirst\\file\\Java\\Demoo.txt");
            if (object.createNewFile()) {
                System.out.println("File created successfully : " + object.getName());
            } else {
                System.out.println("file already exists");
            }
        }
        catch(IOException e){
            System.out.println("Somethimg unexpected happened");
        }


        }






}
