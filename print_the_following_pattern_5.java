import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ;i++)
        {
            for (int j = 1 ; j <= n ; j++)
            {
                if (j==i)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}