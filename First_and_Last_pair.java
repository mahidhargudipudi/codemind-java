import java.util.*;
public class FirstAndLast{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> myArr = new ArrayList<>();
        for (int i = 0 ; i < n /2 ;i++)
        {
            myArr.add(arr[i]);
            myArr.add(arr[n - i - 1]);
        }
        if (n % 2 != 0)
        {
            myArr.add(arr[n / 2]);
            myArr.add(0);
        }
        for (int i : myArr)
        {
            System.out.print(i + " ");
        }
    }
}