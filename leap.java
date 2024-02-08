import java.util.Scanner;
public class leap{
    public static void main(String args[]){
        System.out.println("input any year.");
        Scanner in =new Scanner(System.in);
        int year =in.nextInt();
        boolean a = (year %4==0);
        boolean b = (year%100!=0);
        boolean c = ((year%400==0)&& (year%100==0));
        if (a && (b || c)){
            System.out.println("this is a leap year.");
        } else {
            System.out.println("this is not a leap year.");
        }
    }
}