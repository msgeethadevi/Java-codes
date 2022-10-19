package JavaTest1;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int[] num={1,3,5,7,9};
            System.out.println(num[5]);
            System.out.println(num[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You have given more than 6 characters");
        }

    }

}
