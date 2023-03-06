package Predicate;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> p = i->(i>20);
        System.out.println(p.test(12));
        System.out.println(p.test(22));

        Predicate<String>  p1 = s->(s.length()>5);
        System.out.println(p1.test("abcdefg"));

    }
}
