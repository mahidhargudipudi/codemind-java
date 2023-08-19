import java.util.Scanner;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++)
        {
            double x1 ,x2,y1,y2;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            if (y1/x1 < y2/x2)
            {
                System.out.println(-1);
            }
            else if (y1/x1 == y2/x2)
            {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
            // if( n!= 3){
            //     System.out.print(x1 +" "+ x2 + " "+ y1+ " " + y2);
            // }
        }
    }
}