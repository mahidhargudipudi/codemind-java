import java.util.*;
public class Temp{
    static int reverse(int n)
    {
        int s = 0 ;
        while(n>0)
        {
            s = s*10 + n%10;
            n /= 10;
        }
        return s;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n < 0)
        {
            System.out.println("-"+(reverse(-n)));
        }
        else
        {
            System.out.println(reverse(n));
        }
    }
}