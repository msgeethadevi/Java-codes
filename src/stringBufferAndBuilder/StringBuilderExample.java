package stringBufferAndBuilder;

public class StringBuilderExample {

    public void stringAppend(){

        StringBuilder sb= new StringBuilder("Placement"); //sb=Placement
        System.out.println("Old Text is : "+ sb);          // Placement
        sb.append("Training");
        System.out.println("New Text is : " + sb);          // Placement Training

    }
    public void stringInsert(){
        StringBuilder sb= new StringBuilder("ja");
        sb.insert(1,"av");
        System.out.println("After insertion : " + sb); //After insertion : java
    }

    public void stringReverse(){
        StringBuilder sb= new StringBuilder("Core Java");
        sb.reverse();
        System.out.println("After reversing : " + sb); //After reversing : avaJ eroC
    }

    public static void main(String[] args) {
        StringBuilderExample builderExample = new StringBuilderExample();

        builderExample.stringAppend();
        builderExample.stringReverse();
        builderExample.stringInsert();
    }


}
