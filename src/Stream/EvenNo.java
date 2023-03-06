package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<=10;i++){
            l1.add(i);
        }

        System.out.println(l1);
        List<Integer> l2 = l1.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(l2);

        //other stream functions

        long count = l1.stream().filter(i -> (i % 2 == 0)).count();
        System.out.println("Count :"+count);

        Comparator<Integer> comp = (i1,i2)->i2.compareTo(i1); // to change the sorting order

        List<Integer> collect = l1.stream().filter(i -> (i % 2 == 0)).sorted(comp).collect(Collectors.toList());
        System.out.println("Sorted filterd list :"+collect);
        collect.stream().forEach(i-> System.out.println(i));


    }
}
