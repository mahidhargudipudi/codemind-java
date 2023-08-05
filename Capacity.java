import java.util.Scanner;
public class Capacity{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int t,s,b,c;
        t=ip.nextInt();
        s=ip.nextInt();
        b=ip.nextInt();
        c=(1024*t*s*b)/1024;
        System.out.println(c+" KB");
    }
}