import java.util.*;
public class Temp{
    static boolean isPrime(int n)
    {
        int c =0 ;
        if (n < 2){
            return false;
        }
        for (int i = 2 ; i <= (int) Math.sqrt(n) ; i++)
        {
            if (n % i == 0){
                c = 1;
                break;
            }
        }
        return c == 0;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int myMin = arr[0] ;
        int myMax = arr[0] ;
        int minInd = 0;
        int maxInd = 0;
        for (int i = 0 ; i < n ; i++)
        {
            if (arr[i] < myMin){
                myMin = arr[i];
                minInd = i;
            }
            if (arr[i] > myMax)
            {
                myMax = arr[i];
                maxInd = i;
            }
        }
        int c = 0 ;
        if (minInd < maxInd)
        {
            for (int i = minInd ; i <= maxInd ; i++)
            {
                if (isPrime(arr[i])){
                    c++;
                }
            }
        }
        else{
            for (int i = maxInd ; i <= minInd ; i++)
            {
                if (isPrime(arr[i])){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}