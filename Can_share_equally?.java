import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a==0)
        {
            if (b%2==0)
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
            }
        }
        else if (a!=0)
        {
            if (a%2==0)
            {
                System.out.println("YES");
            }
            else 
            {
                System.out.println("NO");
            }
        }
    }
}