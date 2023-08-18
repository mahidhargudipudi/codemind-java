import java.util.Scanner;
public class Cars
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n1,n2,x;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        x = sc.nextInt();
        if (n1>n2)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(((n1+x)/n2)+1);
        }
    }
}