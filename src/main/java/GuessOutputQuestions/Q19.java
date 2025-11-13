package GuessOutputQuestions;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Object i= new ArrayList<>().iterator();
        System.out.println((i instanceof List) + ",");
        System.out.println((i instanceof Iterator) + ",");
        System.out.println(i instanceof ListIterator);
    }
}

/*

A) false, true, false

B) false, true, true

C) false, false, false

D) true, true, false

 */