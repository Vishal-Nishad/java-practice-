import java.util.Scanner;
public class nsum{
    public static void main(String args[]){
        System.out.println("enter any number.");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int count=1;
        while(count<=n){
            sum=sum+count;
            count++;
        } System.out.println(sum);
    }
}