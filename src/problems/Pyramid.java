package problems;

public class Pyramid {
    public static void main(String[] args) {
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=k+i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
