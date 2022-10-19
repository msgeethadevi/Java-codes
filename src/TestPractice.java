public class TestPractice {
        int RollNo;
        String name;
        String EmailId;
        public TestPractice(int RollNo, String name,String EmailId){         //constructor
            this.RollNo = RollNo;
            this.name = name;        // This is a keyword used to access variables from class in constructor
            this.EmailId = EmailId;

        }
        void display(){                                      // method
            System.out.println(this.RollNo+ "  " +this.name +"  " + this.EmailId);
        }

        public static void main(String[] args) {                     //Main function
            TestPractice sl1 = new TestPractice(1, "shree", "bnshree@gmail.com");
            sl1.display();

        }

    }

