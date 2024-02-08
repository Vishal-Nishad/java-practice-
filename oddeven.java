import java.util.Scanner;
public class oddeven{
    public static void main(String args []){
        System.out.println("enter a number :");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        if (n%2==0){
            System.out.println("entered number is even ");
        } else {
            System.out.println("entered number is odd ");
        }
    }
}