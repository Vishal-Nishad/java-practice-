import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
        System.out.println("enter any positive number.");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int ans=1;
        int count=1;
        while(count<=num){
            ans*=count;
            count++;

        }System.out.println("factorial is : "+ans);
    }
}