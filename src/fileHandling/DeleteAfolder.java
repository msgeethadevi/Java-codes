package fileHandling;

import java.io.File;

public class DeleteAfolder {
    public static void main(String[] args) {
        File object = new File("C:\\Users\\geeth\\IdeaProjects\\GeethaFirst\\file\\Java");

        if(object.delete()){
            System.out.println("Folder Deleted : " +object.getName());
        }
        else {
            System.out.println("The Folder is already Deleted");
        }
    }



}


