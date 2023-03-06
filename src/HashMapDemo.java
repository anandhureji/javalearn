import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Anandhu",100);
        map.put("Arjun",200);
        Set<String> strings = map.keySet();  // to get keys alone
        System.out.println(strings);

        System.out.println(map);
    }
}
