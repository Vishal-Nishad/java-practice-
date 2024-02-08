import java.util.Scanner;
public class primmethod{
    public static boolean isprime(int n){
        for(int c=2;c*c<=n;c++){
            if(n%c==0){
                return false;
            }
        }return true;
    }
    public static void prime(int n){
        if(n<=1){
            System.out.println("neither prime nor composite.");
        }else{
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }}
    }public static void main(String args[]){
        System.out.println("enter any number.");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        prime(n);
    }
}