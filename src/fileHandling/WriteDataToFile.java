package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        FileWriter write=new FileWriter("C:\\Users\\geeth\\IdeaProjects\\GeethaFirst\\file\\Java\\Demoo.txt", true);
        write.append("\nHi everyone new");
        write.append("\nWorking");
        write.close();
        System.out.println("File written successfully");


    }
}
