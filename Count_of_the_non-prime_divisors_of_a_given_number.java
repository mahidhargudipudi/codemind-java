import java.util.*;
public class Temp{
    static boolean isPrime(int a)
    {
        int c = 0 ;
        if (a<2)
        {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(a);i++)
        {
            if (a % i == 0)
            {
                c++;
            }
        }
        return c == 0 ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c = 1;
        for (int i = 3 ; i <= n ; i++)
        {
            if (n%i==0 && !(isPrime(i)))
            {
                c += 1;
            }
        }
        System.out.println(c);
    }
}