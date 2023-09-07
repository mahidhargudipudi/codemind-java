import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0 ;
        for (int i = 0 ; i < s.length() ; i++)
        {
            if ((int)s.charAt(i) > c)
            {
                c = (int)s.charAt(i);
            }
        }
        System.out.println((char)c);
    }
}