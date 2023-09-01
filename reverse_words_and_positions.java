import java.util.*;
public class Reverse{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String [] arr = s.split(" ");
        for (int i = arr.length-1 ; i >= 0 ; i--)
        {
            String ns = "";
            for(int j = arr[i].length()-1 ; j >= 0 ; j--)
            {
                ns += arr[i].charAt(j);
            }
            System.out.print(ns+ " ");
        }
        
    }
}