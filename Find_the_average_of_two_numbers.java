import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b,avg;
        a = sc.nextFloat();
        b = sc.nextFloat();
        avg = (a+b)/2;
        System.out.printf("%.4f",avg);
    }
}