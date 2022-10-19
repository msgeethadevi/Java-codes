package fileHandling;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {


        File object = new File("C:\\Users\\geeth\\IdeaProjects\\GeethaFirst\\file\\Java\\Demoo.txt");
        if (object.delete()) {
            System.out.println("File deleted successfully : " + object.getName());
        } else {
            System.out.println("file already deleted");
        }

    }





}
