import java.util.Scanner;
public class Num{
    static int numDigits(int a){
        int c = 0 ;
        while(a!=0)
        {
            int rem =a%10;
            a /= 10;
            c+=1;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0 ; i < n ; i++)
        {
            if (numDigits(arr[i])%2 == 0)
            {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}