package Array;

public class MultiDArray {
    public static void main(String[] args) {
        int [] [] numbers = {{1,2,3,7,9},
                {5,3,4,5,6},
                {3,4,5,6,2}};


        for(int i=0; i<numbers.length; i++){

            for(int j=0; j<5; j++){
                System.out.print("  " + numbers[i][j] );
            }
            System.out.println();
        }
    }
}
