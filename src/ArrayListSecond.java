import java.util.*;

public class ArrayListSecond {

    public static void main(String[] args){
        Integer a[]={1,2,4,3,5,7,6,8,11,10,13,25};
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int size = list.size();
        System.out.println(list);
        System.out.println("Second largest no:"+a[size]);



    }
}
