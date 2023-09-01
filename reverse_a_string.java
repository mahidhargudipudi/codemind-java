import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] arr = new char[s.length()];
        int j = 0 ;
        for (int i = s.length()-1 ; i >= 0 ; i--)
        {
            arr[j] = s.charAt(i);
            j++;
        }
        System.out.println(arr);
    }
}