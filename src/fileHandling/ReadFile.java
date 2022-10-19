package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("C:\\Users\\geeth\\IdeaProjects\\GeethaFirst\\file\\Java\\Demoo.txt");
        Scanner read= new Scanner(obj);
        String insidefile=read.nextLine();
        System.out.println(insidefile);
//        try {
//            read = null;
//        }
//        catch (NoSuchElementException e) {           without using all these steps we can get output with 2 lines
//            throw (new FileNotFoundException());
////        }
//        while(read.hasNextLine()){
//            String data = read.nextLine();
//            System.out.println(data);
//        }
        read.close();
    }
}
