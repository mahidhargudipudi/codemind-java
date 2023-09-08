import java.util.*;
public class Temp{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String str = s.toLowerCase();
        int a , e , ii , o , u ;
        a = e = u = ii = o = u = 0 ;
        for (int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a')
            {
                a += 1;
            }
            else if (ch == 'e')
            {
                e += 1;
            }
            else if (ch == 'i')
            {
                ii += 1;
            }
            else if (ch == 'o')
            {
                o += 1;
            }else if (ch == 'u')
            {
                u += 1;
            }
        }
        if (a == 0) 
            System.out.print('a' + " ");
        if (e == 0) 
            System.out.print('e' + " ");
        if (ii == 0) 
            System.out.print('i' + " ");
        if (o == 0) 
            System.out.print('o' + " ");
        if (u == 0) 
            System.out.print('u' + " ");
        else
            System.out.println(0);
    }
}