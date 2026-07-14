import java.util.Scanner;

public class Multipler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        System.out.println(m%n==0?"Exact Multipler":"Not Exact");
    }
}
