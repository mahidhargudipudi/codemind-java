import java.util.*;
public class Temp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.toLowerCase();
        int a , e , ii , o , u ;
        a = e = ii = o = u = 0 ;
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
            }
            else if (ch == 'u')
            {
                u += 1;
            }
        }
        if (a > 0 && e > 0 && ii > 0 && o > 0 && u > 0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}