import java.util.*;
public class temp{
    static boolean isPrime(int n)
    {
        int c = 0 ;
        if (n < 2)
        {
            return false;
        }
        for  (int i = 2 ; i <= Math.sqrt(n) ;i++)
        {
            if ( n % i == 0)
            {
                c = 1 ;
                break;
            }
        }
        return c == 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = 1;
        while(true)
        {
            if (isPrime(n1+n2+n3))
            {
                System.out.println(n3);
                break;
            }
            n3++;
        }
    }
}