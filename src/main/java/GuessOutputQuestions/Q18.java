package GuessOutputQuestions;
class First1{
    int i=10;

    public First1(int j){
        System.out.println(i);
        this.i= j*20;
    }
}

class Second2 extends First1 {
    public Second2(int j) {
        super(j);
        System.out.println(i);
        this.i = j * 40;
    }
}
public class Q18 {

    public static void main(String[] args) {
        Second2 secondobj = new Second2(5);
        System.out.println(secondobj.i);
    }

}

/*

A) 10
   200
   100

B) 200
   100
   0

C) compiler error (no default constructor)

D) 10
   100
   200

 */
