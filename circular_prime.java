import java.util.*;
public class Temp{
    static int reversedNum(int n)
    {
        String s = Integer.toString(n);
        StringBuffer st = new StringBuffer(s);
        st.reverse();
        String str = new String(st);
        int myNum = Integer.parseInt(str);
        return myNum;
    }
    static boolean isPrime(int n)
    {
        int c = 0;
        if (n < 2) return false;
        for (int i = 2 ; i <= (int) Math.sqrt(n); i++)
        {
            if (n % i == 0){
                c = 1;
                break;
            }
        }
        return c == 0;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(reversedNum(n));
        if (isPrime(n))
        {
            if(isPrime(reversedNum(n)))
            {
                System.out.println("circular prime");
            }
            else
            {
                System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
