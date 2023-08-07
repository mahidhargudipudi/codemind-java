import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c,ar,s;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        s = (a+b+c)/2;
        ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}