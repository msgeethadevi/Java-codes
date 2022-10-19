package stringBufferAndBuilder;

public class StringBufferExample {

    public void stringAppend(){

        StringBuffer sb= new StringBuffer("Placement"); //sb=Placement
        System.out.println("Old Text is : "+ sb);          // Placement
        sb.append("Training");
        System.out.println("New Text is : " + sb);          // Training

    }
    public void stringInsert(){
        StringBuffer sb= new StringBuffer("ja");
        sb.insert(1,"av");
        System.out.println("After insertion : " + sb);
    }

    public void stringReverse(){
        StringBuffer sb= new StringBuffer("ababa");
        sb.reverse();
        System.out.println("After reversing : " + sb);
    }



    public static void main(String[] args) {
        StringBufferExample bufferExample = new StringBufferExample();

        bufferExample.stringAppend();
        bufferExample.stringReverse();
        bufferExample.stringInsert();

    }



}
