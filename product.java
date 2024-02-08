import java.util.Scanner;
public class product{
    public static int prod(int a,int b){
        //5nt ans=0;
        int  ans=a*b;
        // System.out.println("ans is : "+ans);
        return(ans);
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int fin = prod(a,b);
        System.out.println("ans is : "+fin);
    }
}