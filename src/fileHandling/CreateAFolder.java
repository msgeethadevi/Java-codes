package fileHandling;

import java.io.File;

public class CreateAFolder {
    public static void main(String[] args) {
        File object = new File("C:\\Users\\geeth\\IdeaProjects\\GeethaFirst\\file\\Java");

        if(object.mkdir()){
            System.out.println("Folder created : " +object.getName());
        }
        else {
            System.out.println("The Folder is already created");
        }
    }
}
