package GuessOutputQuestions;
class First{
    public First(String a){
        System.out.println("first class");
    }
}

class Second extends First {
    public Second(){
        super("");
        System.out.println("second class");
    }

    public Second(int a){
        super("");
        
    System.out.println("second class");
}

}
class Third extends Second{
    public Third(){
        super(3);
        System.out.println("third class");
    }
}
public class Q17 {

    public static void main(String[] args) {
        Third c = new Third();

    }
}

/*

A) third class
   second class
   first class

B) third class
   first class
   second class

C) second class
   first class
   third class

D) first class
   third class
   second class


 */