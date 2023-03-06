import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Anandhu",100);
        map.put("Arjun",200);
        Set<String> strings = map.keySet();  // to get keys alone
        Collection<Integer> values = map.values(); // to get collection of values
        
        System.out.println(strings);
        System.out.println(values);

        for (String key:strings
             ) {
            System.out.println("Key:"+key+" Values:"+map.get(key));
            
        }
    }
}
