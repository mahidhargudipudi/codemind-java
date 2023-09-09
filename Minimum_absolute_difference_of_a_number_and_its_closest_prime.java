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
                c = 1;
                break;
            }
        }
        return c == 0 ;
    }
    static int NextPrime(int n){
        int i = n+1; 
        int c = 0 ;
        while(true)
        {
            if (isPrime(i))
            {
                c = i ;
                break;
            }
            i ++ ;
        }
        return c ;
    }
    static int PrePrime(int n)
    {
        int c = 0;
        int i = n-1; 
        while(true)
        {
            if (isPrime(i))
            {
                c = i ;
                break;
            }
            i -- ;
        }
        return c ;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        int n = sc.nextInt();
        if (isPrime(n))
        {
            System.out.println(0);
        }
        else
        {
            if ((NextPrime(n)- n) < (n- PrePrime(n)))
            {
                System.out.println(NextPrime(n)-n);
            }
            else  
            {
                System.out.println(n-PrePrime(n));
            }
        }
    }
}