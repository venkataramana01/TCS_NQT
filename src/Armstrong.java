import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n<=0) return;
        int sum=0;
        int x=n;
        while(x>9){
            int m=x%10;
            sum+=m*m*m;
            x/=10;
        }
        sum+=x*x*x;
        System.out.println((sum==n)?"Armstrong":"Not armstrong");
    }
}
