import java.util.Scanner;
public class Temp{
    public static int sum(int[] arr , int ind)
    {
        if (arr.length == ind)
        {
            return 0 ;
        }
        return arr[ind] + sum(arr , ind+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,0));
    }
}