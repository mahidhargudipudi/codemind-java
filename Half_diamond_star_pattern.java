import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n >= 3 && n <= 100)
        {
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i < n ; i++)
        {
            for (int j = 1 ; j <= n-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
    }
}