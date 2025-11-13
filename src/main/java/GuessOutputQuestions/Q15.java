package GuessOutputQuestions;
interface Sound{
    default public void sound(){
        System.out.println("sound");
    }
}

class Child implements Sound{
    int a=10;
    public void sound(){
        System.out.println("child sound");
    }
}

class Parent extends Child{

    int a=5;
    public void sound(){
        System.out.println("parent sound");
    }
}
public class Q15 {

    public static void main(String[] args) {
        Child obj = new Parent();



        obj.sound();
        System.out.println(obj.a);
    }
}

/*

A) parent sound

B) child sound

C) sound

D) compiler error

 */
