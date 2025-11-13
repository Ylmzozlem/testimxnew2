package GuessOutputQuestions;

public class Q8 {

    static int var = 100;

    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test());


    }

    static int test() {
      int var = 100;
        return var++;
    }
}

/*

A) Some garbage value

B) 100

C) Compiler error

D) 101

*/
