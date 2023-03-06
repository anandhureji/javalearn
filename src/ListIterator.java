import java.util.LinkedList;
import java.util.List;

public class ListIterator {

    public static  void main(String[] args){
        List<String>  strings = new LinkedList<>();
        strings.add("abcd");
        strings.add("xyz");
        strings.add("fgh");

       ListIterator iterator = (ListIterator) strings.listIterator();


    }
}
