import java.util.Scanner;
public class chksign{
    public static void main(String args[]){
        System.out.println("enter a number : ");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        if (num<0){
            System.out.println("negative number.");
        }else if (num==0){
            System.out.println("neutral number.");
        }
        else {
            System.out.println("positve number:");
        }
    }
}