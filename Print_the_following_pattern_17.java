import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n ; i >= 1 ; i--)
        {
            for (int j = 1 ; j <= n ; j++)
            {
                if (j==i || j==(n-(i-1)))
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}