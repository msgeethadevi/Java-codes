package Ploymorphism;

public class Overriding {

//    int rateOfInterest() {
//        return 5;
//    }
}
    class HDFC extends Overriding {
        int rateOfInterest() {
            return 5;
        }
    }

    class Axis extends Overriding {
        int rateOfInterest() {
            return 6;
        }
    }

    class Canara extends Overriding {
        int rateOfInterest() {
            return 7;
        }
    }

    class Banking{
        public static void main(String[] args) {
            HDFC hdfc = new HDFC();
            Canara can = new Canara();
            Axis ax = new Axis();
            System.out.println("the ROI for HDFC is : " + hdfc.rateOfInterest());
            System.out.println("the ROI for Canara is : " + can.rateOfInterest());
            System.out.println("the ROI for Axis is : " + ax.rateOfInterest() );

        }

    }

