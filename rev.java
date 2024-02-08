import java.util.Scanner;
public class rev{
    public static void main(String args[]){
        System.out.println("enter your number:");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev_ans=0;
        while(num>0){
            int lastdigit= num%10;
            rev_ans=rev_ans*10+lastdigit;
            num = num/10;
        }System.out.println(rev_ans);
    }
}