package GuessOutputQuestions;

public class Q10 {
    public static void main(String[] args) {
        Test obj = new Test(15);
        System.out.println("var= " + obj.var);

    }

}

class Test{
    public  int var =30;

    Test(int x){
        var = x;
    }
}

/*
What is output?

A) var=10

B)var=15

C)var=0

D)compiler issue ude to no default constructor


 */
