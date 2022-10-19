package AbstractionExample;

abstract class Animals{

    public abstract void Sound();     // Abstract method

    public void Run(){                // Normal method
        System.out.println("Animals Running speed");
    }
}

class Turtle extends Animals{
    public void Sound() {
        System.out.println(" turtle runs very slow");
    }
}

class Rabbit extends Animals{
    public void Sound(){
        System.out.println("Rabbit runs very fast");
    }

    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Turtle t = new Turtle();

        r.Sound();
        r.Run();
        t.Sound();
        t.Run();
    }

}


