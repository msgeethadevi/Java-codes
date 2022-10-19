package JavaTest1;

public class MLI {

    int Cube(int n){
      return n*n*n;
    }                                 // n*n*n
}

class Square extends MLI{
    int Sq(int n){
        return n*n;
    }
}

class EOrO extends Square{

    void evenOrOdd() {
        int n=9;

        if (n / 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is Odd");
        }

    }
}
 class Final{
     public static void main(String[] args) {
         /* Scanner sc =new Scanner(System.in);
         int n= sc.nextInt();
         System.out.println("Enter the number");  */

         EOrO er= new EOrO();
         System.out.println("The cube of a number is : "+ er.Cube(5));
         System.out.println("The cube of a number is : "+ er.Sq(3));
         er.evenOrOdd();

     }

 }



