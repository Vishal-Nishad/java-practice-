import java.util.Scanner;
public class avaerage{
    public static void main(String[] args){
        int sum=0;
        int count=1;
        while(count<=5){
            System.out.println("enter marks:");
            Scanner in=new Scanner(System.in);
            int s=in.nextInt();
            sum=sum+s;
            count++;

        }System.out.println("average is " +sum/5);
    }
}