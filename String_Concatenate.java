import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s = s1 + s2 ;
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String str = new String (arr);
        System.out.println(str);
    }
}