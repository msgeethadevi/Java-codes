package Array;

public class SingleDArray {
    public static void main(String[] args) {

        // Index starts from 0 to n-1

        String[] name = {"geetha", "shree", "seema"};
        int[] numbers = {1, 2, 3, 4};
        char[] letters = {'g', 'e', 't', 'h', 'a'};

        System.out.println(name[0]);
        System.out.println(name.length);

        for(int i=0; i<3; i++){      // For particular length of array
            System.out.print(name[i]+ " ");
        }
        System.out.println(" ");

        for(int i=0; i<letters.length; i++){      // For any length of array
            System.out.print(letters[i] + " ");
        }

    }
}
