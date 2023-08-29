import java.util.*;
public class temp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int  i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int c = 0 ;
        for (int i : arr)
        {
            if (Math.sqrt(i) == (int)Math.sqrt(i))
            {
                c+=i;
            }
        }
        System.out.println(c);
    }
}