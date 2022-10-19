package userInput;


import java.util.Scanner;

public class areOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //l,b,h to be taken by user

        System.out.println("Enter the breath: ");
        int b = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        float aot= (b*h)* 0.5f;



        System.out.println("Area of triangle is: "+ aot);


    }

}
