import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int h = a*(a-1)/2;
        System.out.printf("%d",h);
    }
}