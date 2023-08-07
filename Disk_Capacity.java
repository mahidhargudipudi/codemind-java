import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t,s,b,cap;
        t =  sc.nextInt();
        s =  sc.nextInt();
        b =  sc.nextInt();
        System.out.println(t*s*b*1024);
    }
}