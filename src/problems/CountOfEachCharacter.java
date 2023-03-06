package problems;

import java.util.HashMap;

public class CountOfEachCharacter {
    public static void main(String[] args) {
        String s ="I am a Full Stack Developer";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int i=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
            i++;
        }
        System.out.println(map);
    }
}
