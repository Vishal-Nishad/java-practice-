import java.util.Scanner;
public class countnum{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int r=in.nextInt();
        int count=0;
        while (count<=n){
            int rem=n%10;
            if(rem==r){
                count++;
            }n=n/10;
        }System.out.println(count);
    }
}