import java.util.*;
public class Collatz{
    static int collatzCount(int n){
        int c = 0;
        while(n!=1){
            c++;
            if ( n % 2 == 0 ){
                n = n/2;
            }
            else{
                n = 3*n + 1;
            }
        }
        return c;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ma = 0;
        int maxNum = 1;
        for (int i = a ; i <= b ; i++)
        {
            if (collatzCount(i) >= ma){
                ma = collatzCount(i);
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
}