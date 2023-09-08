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
            if (str[i].length() < min)
            {
                min = str[i].length();
            }
        }
        System.out.println(min);
    }
}