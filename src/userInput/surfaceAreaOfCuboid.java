package userInput;

import java.util.Scanner;

public class surfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = sc.nextInt();

        System.out.println("Enter the breath: ");
        int b = sc.nextInt();

        System.out.println("Enter the height: ");
        int h = sc.nextInt();

        int cuboid=2*((l*b)+(b*h)+(h*l));

        System.out.println("Surface Area of Cuboid is: "+ cuboid);


    }



}
