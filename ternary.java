import java.util.Scanner;
public class ternary{
    public static void main(String args[]){
        System.out.println("enter your marks: ");
        Scanner in=new Scanner(System.in);
        int marks=in.nextInt();
        String result=(marks>=33)?"congratulations you are pass":"sorry you are fail";
        System.out.println(result);
    }
}