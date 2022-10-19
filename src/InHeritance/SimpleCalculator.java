package InHeritance;

import java.util.Scanner;


    public class SimpleCalculator {
        float add(float a, float b) {      //method
            return a + b;
        }          // method no 1
    }
    class AdvanceCalculator extends SimpleCalculator{         // method no 2
        float sub(float a,float b) {
            return a - b;
        }
    }

    class SuperAdvanceCalculator extends AdvanceCalculator{     //// method no 3
        float mul(float a, float b){
            return a*b;
        }
        float div(float a, float b){
            return a/b;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the two numbers : ");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            SuperAdvanceCalculator obj = new SuperAdvanceCalculator();
            System.out.println("addition is : " + obj.add(num1,num2));
            System.out.println("Substraction : " + obj.sub(num1,num2));
            System.out.println("Multiplication : " +obj.mul(num1,num2));
            System.out.println("division : " + obj.div(num1,num2));
        }
    }

