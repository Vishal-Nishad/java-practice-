import java.util.Scanner;
public class prim{             //to print whether a number is prime or not.
    public static void main(String args []){
        System.out.println("enter any number.");
        int a=0;
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        if (num<=1){
            System.out.println("entered number is neither prime nor composite.");          
        } else {
        int c=2;
        while(c*c<=num){
            if(num%c==0){
               // System.out.println(num+"number is not prime");
                a =1;
                break;
            } 
            c++;
         } 
         if(a!=0){
            System.out.println("number is not  prime. ");
            System.out.println(a);
            
         } else {
                 System.out.println("number is  prime.");
                 System.out.println(a);
            }
         }
}
}