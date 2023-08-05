import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ar;
        int r;
        r = sc.nextInt();
        ar = 3.14*r*r;
        System.out.printf("%.2f",ar);
    }
}