import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b,m;
        a = sc.nextFloat();
        b = sc.nextFloat();
        m = a*b;
        System.out.printf("%.2f",m);
    }
}