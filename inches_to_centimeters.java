import java.util.Scanner;
public class Inch
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        double cm = h*2.54;
        System.out.printf("%.2f",cm);
    }
}