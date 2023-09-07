import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0 ;
        for (int i  = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if (ch <= '9' && ch >= '0')
            {
                c += (int)ch-48;
            }
        }
        System.out.println(c);
    }
}