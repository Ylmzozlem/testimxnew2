package GuessOutputQuestions;

public class Q13 {

    public static void main(String[] args) {
        fun(null);
// byte<short<int<long<float<double<Object
        // String<Object
        //Byte,Short,Integer,Long,Float,Double, String < Object
    }

    public static void fun(String s) {
        System.out.println("TechPro string");
    }


    public static void fun(Object o){
        System.out.println("TechPro object");
    }
}

/*

A) compiler error

B) runtime error

C) TechPro object

D) TechPro string

 */
