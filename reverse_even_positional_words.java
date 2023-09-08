import java.util.*;
public class Temp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        int min = str[0].length();
        for (int i = 0 ; i < str.length ; i++)
        {
            if (i % 2 == 0)
            {
                String ns = "";
                String given = str[i];
                for ( int j = str[i].length()-1 ; j >= 0 ; j--)
                {
                    ns += given.charAt(j) ;
                }
                System.out.print(ns + " ");
            }
            else
            {
                System.out.print(str[i] + " ");
            }
        }
        
        
    }
}