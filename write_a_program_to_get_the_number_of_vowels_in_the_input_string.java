import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0 ;
        String v = "aeiouAEIOU";
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (v.contains(""+s.charAt(i)))
            {
                c += 1;
            }
        }
        System.out.println(c);
    }
}