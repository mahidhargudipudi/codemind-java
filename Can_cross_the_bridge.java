import java.util.Scanner;
public class Bridge{
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z,c;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        // x*c + y =z
        c=(z-y)/x;
        System.out.println(c);
    }
}