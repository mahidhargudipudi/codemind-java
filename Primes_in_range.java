import java.util.Scanner;
public class Temp{
    static boolean isPrime(int a)
    {
        int c = 0 ;
        if (a < 2)
        {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(a) ; i++)
        {
            if (a%i==0)
            {
                c = 1 ; 
                break;
            }
        }
        return c == 0 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m , n ;
        m = sc.nextInt();
        n = sc.nextInt();
        int c = 0 ;
        for (int i = m ; i <= n ; i++)
        {
            if (isPrime(i))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}