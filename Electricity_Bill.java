import java.util.Scanner;
public class Bill{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String ID = sc.nextLine();
        String Name = sc.nextLine();
        int u = sc.nextInt();
        double b,sr,tb;
        if ( u < 200)
        {
            b = 1.20*u;
        }
        else if (u >= 200 && u <= 400)
        {
            b = 1.50*u;
        }
        else if (u >= 400 && u<= 600)
        {
            b = 1.80*u;
        }
        else
        {
            b = 2.00*u;
        }
        if (b>400)
        {
            sr = 0.15*b;
        }
        else
        {
            sr = 100 ; 
        }
        tb = b+sr;
        System.out.printf("%.2f",tb);
    }
}