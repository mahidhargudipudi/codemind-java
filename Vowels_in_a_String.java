import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch  = sc.next().charAt(0) ; 
        String v = "aeiouAEIOU";
        int flag = 0 ;
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (ch == s.charAt(i))
            {
                flag = 1 ;
                System.out.println("True");
                System.out.println(i);
                break;
            }
        }
        if (flag == 0) System.out.println("False");
    }
}