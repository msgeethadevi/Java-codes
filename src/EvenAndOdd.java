import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int r = sc.nextInt();

        for(int i = 1; i < r; i++) {           //check even or odd  till 10
            if (i%2 == 0) {
                System.out.println(i + " is Even");
            }
            else {
                System.out.println(i + " is Odd");
            }
        }
    }
}