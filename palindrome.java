import java.util.Scanner;
public class palindrome{
    public static void palindrom(int n){
        int k=n;
        int pow=0;
        int ans=0;
        while(n>0){
            int ld=n%10;
             ans=ans*10+ld;
            
            n=n/10;
            pow++;
        } if(ans==k){
                System.out.println("number is palindrome.");
        }else{
                 System.out.println("number is not palindrome.");
    }
 } public static void main(String args[])
    {
        System.out.println("enter any number.");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        palindrom(n);
    }
}