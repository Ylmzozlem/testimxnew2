package GuessOutputQuestions;

public class Q9 {
    public static void main(String[] args) {
        Base x= new Base();
        Base y= new Derived();
        Derived z= new Derived();
        print(x);
        print(y);
        print(z);

    }

    static void print(Base base_obj){
        base_obj.print();
    }
}

class Base{
    public void print() {
        System.out.println("Base Class");
    }
}

class Derived extends Base {
    public void print(){
        System.out.println("Derived Class");
    }
}

/*
What is output?

A)Base Class
    Derived Class
    Derived Class

B)Base Class
    Base Class
    Derived Class

C)Compiler error

D)Base Class
    Base Class
    Base Class


 */
