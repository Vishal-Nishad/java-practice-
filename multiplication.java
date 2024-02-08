import java.util.Scanner;
public class multiplication{
    public static void main(String args[]){
        System.out.println("enter a number.");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int count =1;
        int ans=0;
        while(count<=10){
             ans =num*count;
             System.out.println(num+" * "+count+" = "+ans);
            count ++;
        }
    }
}