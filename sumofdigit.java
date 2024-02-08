import java.util.Scanner;
public class sumofdigit{
    public static void sumofdigit(int n){
        int k=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans+rem;
            n=n/10;
        }//return ans;
        System.out.println("sum of digit "+k +" is :"+ans);
        return ;
    }
    public static void main(String args[]){
        System.out.println("enter any number .");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        sumofdigit(n);
    }
}