import java.util.Scanner;
public class sqarea{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the side of square :");
        int a =in.nextInt();

        System.out.println("area of square is : "+ a*a);
    }
}