import java.util.*;
public class Temp{
    static boolean isPrime(int n)
    {
        int c = 0 ;
        if (n < 2)
        {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if (n % i == 0)
            {
                c = 1 ;
                break ;
            }
        }
        return c == 0 ;
    }
    static boolean megaPrime(int n)
    {
        int c = 0 ;
        while(n != 0 )
        {
            if (!(isPrime(n%10)))
            {
                c = 1;
                break;
            }
            n /= 10 ;
        }
        return c == 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (isPrime(k))
        {
            if (megaPrime(k))
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else{
            System.out.println("Not Mega Prime");
        }
    }
}