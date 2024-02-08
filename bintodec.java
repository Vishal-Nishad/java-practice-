import java.util.Scanner;
public class bintodec{
    public static void bintodec(int n){
        int mynum=n;
        int ans=0;
        int pow=0;
        int ld;
        while (n>0){
            ld=n%10;
            ans=ans+(ld*(int)Math.pow(2, pow));
            pow++;
            n=n/10;
        }System.out.println("decimal number of "+mynum+" is "+ans);
    }
    public static void dectobin(int n){
        int mynum=n;
        int ans=0;
        int pow=0;
        while(n>0){
           // int pow=0;
            int rem=n%2;
            ans=ans+(rem*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
            
        }System.out.println("binary number of  "+mynum+" is :"+ans);

    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter any number .");
        int n=in.nextInt();
        System.out.println("enter any binary number.");
        int b=in.nextInt();
        bintodec(b);
        dectobin(n);      
    }}
