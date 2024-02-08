import java.util.Scanner;
public class factmethod{
    public static int fact(int d){
        int ans=1;
       int count=1;
        while (count<=d){
             ans*=count;
             count ++;

        }return (ans);
    }
    public static int bincoeff(int n,int r){
        int a=fact(n); System.out.println(a);
        int b=fact(r);  System.out.println(b);
        int e=n-r;
        int c=fact(e);  System.out.println(c);
        int ans=a/(b*c);
        return(ans);
    }
    public static void main(String args[]){
        System.out.println("enter any number.");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=in.nextInt();
       //nt fin=fact(n);
       int fin=bincoeff(n, r);
        System.out.println("binomial coefficient of given no. is : "+fin);
    }
}