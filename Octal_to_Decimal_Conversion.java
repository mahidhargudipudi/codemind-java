import java.util.Scanner;
public class OctToDeci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Integer.parseInt(s,8));
    }
}