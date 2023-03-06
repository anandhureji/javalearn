package problems;

public class ReverseEachString {
    public static void main(String[] args) {
        String str = "Java is Awesome !!";
        System.out.println(str);
        String[] temp = str.split(" ");
        int i = 0;
        String result = "";
        while(i< temp.length){
            result+= new StringBuffer(temp[i]).reverse().toString() +" ";
            i++;
        }
        System.out.println(result);
    }
}
