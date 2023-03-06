import java.util.Set;
import java.util.TreeSet;

public class Strinbuffer {

    public static void main(String[] args){

        Set<StringBuffer> strinbufferSet = new TreeSet<>();
        strinbufferSet.add(new StringBuffer("abc"));
        strinbufferSet.add(new StringBuffer("xyz"));
        strinbufferSet.add(new StringBuffer("def"));

        for (StringBuffer obj:strinbufferSet
             ) {
            System.out.println(obj);
            
        }

    }
}
