package GuessOutputQuestions;

public class Q3 {
    Q3(int a, int b){
        System.out.println("Parameterized Constructor 1");
    }

    Q3(int a, float b){
        System.out.println("Parameterized Constructor 2");
    }

    public static void main(String[] args) {
        byte a=10;
        double b=  15;

        // byte<short<int<long<float<double

        Q3 obj = new Q3(a,(long) b);
    }
}


/*
What is output?

A)Parameterized Constructor 1

B)Parameterized Constructor 2

C)Compile time error because of method overload

D)Run Time Error

 */