import java.util.Scanner;
public class Temp{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0 ;i < a; i++){
            String s = sc.next();
            int d =(Integer.parseInt(s,2));
            System.out.println(Integer.toString(d,8));
        }
    }
}