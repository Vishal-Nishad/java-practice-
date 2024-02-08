import java.util.Scanner;
public class printnnum{
    public static void main(String args[]){
        System.out.println("enter any number.");
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int count=1;
        while(count<=n){
            System.out.println(count);
            count++;
        }
    }
}