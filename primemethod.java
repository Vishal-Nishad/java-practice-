import java.util.Scanner;
public class primemethod{
    public static boolean isprime(int n){
        boolean isprime=true;
        if (n<=1){
           System.out.println("neither prime nor composite");
            isprime=false;
        }else{
        
    //    boolean isprime=true;
       for(int c=2;c*c<=n;c++){
        if(n%c==0){
            isprime=false;
        }
       }}return isprime;
 
    }public static void primenum(int n){
        for (int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
     public static void main(String args[]){
        System.out.println("enter any positive number.");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        //isprime(n);
        //System.out.println(isprime(n));
        System.out.println("prime numbers are:");
        primenum(n);
    }
}