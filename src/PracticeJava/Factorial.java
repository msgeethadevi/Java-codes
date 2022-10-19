package PracticeJava;

import java.util.Scanner;

public class Factorial {

    public static int factorial (int n){
        if (n<0){
            return -1;
        }
        else if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("factorial of negative no is invalid");
        }
        else if(n==0 || n==1){
            System.out.println("factorial of "+ n+ " is " +fact);
        }
        else {

            for (int i = 1; i <= n; i++) {
                fact = fact * i;

            }
            System.out.println("the factorial of N is : " + fact);
        }
        System.out.println("Method factorial is " + factorial(n));
    }

}
