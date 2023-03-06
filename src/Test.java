import lamda.Sum;

public class Test {
    public static void main(String[] args) {


        Sum sum = (x, y) -> System.out.println("Sum is " + (x + y));
        sum.add(10,20);
    }
}
