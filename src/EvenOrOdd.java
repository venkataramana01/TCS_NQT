import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println(((x & 1)==0)?"Even":"Odd");
    }
}