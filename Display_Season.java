import java.util.Scanner;
public class Season{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        if (i==2 || i==3)
        {
            System.out.println("Spring");
        }
        else if (i>=7 && i<=10)
        {
            System.out.println("Rainy");
        }
        else if (i>=4 && i<=6)
        {
            System.out.println("Summer");
        }
        else if (i==1 || i== 11 || i== 12)
        {
            System.out.println("Winter");
        }
        else
        {
            System.out.println(-1);
        }
    }
}