import java.util.*;
public class AbsoluteDiff{
    static void diffOf(int n, int x)
    {
        String s = Integer.toString(n);
        String s1 = "";
        String s2 = "";
        for (int i = 0 ; i < x ; i++)
        {
            s1 += s.charAt(i);
        }
        for(int i = s.length()-1 ; i >= (s.length()-x) ; i--)
        {
            s2 += s.charAt(i);
        }
        StringBuffer st = new StringBuffer(s2);
        st.reverse();
        s2 = new String(st);
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        System.out.println( Math.abs(n1 - n2));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        diffOf(n,x);
    }
}