import java.util.Scanner;
public class Temp{
    static boolean isPrime(int n)
    {
        int c = 0 ;
        for (int i = 1 ; i <= n; i++)
        {
            if (n%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    static boolean isPal(int n){
        int rev = 0;
        int temp = n;
        while(n>0)
        {
            rev = rev*10+n%10;
            n = n / 10;
        }
        return rev == temp ;
    }
    static void fun(int i)
    {
        while(true)
        {
            if (isPrime(i)&&isPal(i)){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n+1);
    }
    
}