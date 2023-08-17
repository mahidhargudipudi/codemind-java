import java.util.Scanner;
public class Temp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++)
        {
            String s = sc.next();
            int b =Integer.parseInt(s,8);
            System.out.println(Integer.toBinaryString(b));
        }
    }
}