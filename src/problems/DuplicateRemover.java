package problems;

import java.util.ArrayList;

public class DuplicateRemover {
    public static void main(String[] args) {
        String s = "aabbccddefghijklmmnn";
        ArrayList<Character> list = new ArrayList<>();
        int size = s.length();
        for(int i=0;i<size;i++){
            char c = s.charAt(i);
            if(!list.contains(c)){
                list.add(c);
            }
        }
        System.out.println(list);
        String a="";
        for (Character character:list
             ) {
            a+=character;

        }
        System.out.println(a);

    }



}
