import java.util.Scanner;
public class iseven{
    public static boolean iseven(int n){
        //boolean iseven=true;
       // System.out.println("enter any number.");
        if(n%2==0){
            return true;
        }return false;
    }
    public static void main(String args[])
    {
        System.out.println("enter any number.");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(iseven(n));
        if(iseven(n)){
            System.out.println("number is even.");
        }else{
            System.out.println("number is odd");
        }
    }
}