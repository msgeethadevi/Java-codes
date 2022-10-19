package PracticeJava;

public class ExceptionHandling {
    public static void main(String[] args) {
        int i,j,k=0;
        try{
            i=10;
            j=2;
            k=i/j;
            String data ="geetha";
            int[] numbers={1,2,3,4,5,6};
            System.out.println(data.indexOf(7));
            System.out.println(numbers[7]);


        }
        catch (ArithmeticException e){
            System.out.println("Invalid division");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid limit for array");
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("Exiting the code // releasing the memory");
        }
        System.out.println(k);
    }

}
