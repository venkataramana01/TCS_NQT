import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1;
        System.out.print(a +" ");
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
        }
    }
}
