import java.net.SocketPermission;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n =sc.nextInt();
        if(n%4==0){
        System.out.print("leap year");
        }
        else{
            System.out.print("leap year not");
        }
    }
}
