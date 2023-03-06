import java.util.*;

public class ArrayinRevers {
    public static void main(String[] args){
       List<Integer> list1 = new ArrayList<>();
       list1.add(100);
       list1.add(200);
       list1.add(200);
       list1.add(300);
       list1.add(400);
        list1.add(400);
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        Set<Integer> set1= new TreeSet<>(list1);
        System.out.println("SET:"+set1);

    }
}
