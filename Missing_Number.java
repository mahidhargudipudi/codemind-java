import java.util.Scanner;
public class Misiing {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = n*(n+1)/2;
        int s = 0;
        for (int i = 1 ; i < n ; i++)
        {
            int a = sc.nextInt();
            s+=a;
        }
        System.out.println(sum-s);
    }
}