import java.util.Scanner;
public class Pretty{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++)
        {
            int  a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            int cnt = 0;
            for (int j = a ; j <= b ; j++)
            {
    
                int rem = j%10;
                if (rem == 2 || rem == 3 || rem ==9)
                {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}