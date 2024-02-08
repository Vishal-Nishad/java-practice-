import java.util.Scanner;
public class breakst{
    public static void main(String args[]){
        do{
            System.out.println("enter any number:");
            Scanner in =new Scanner(System.in);
            int num=in.nextInt();
           
            if (num%10==0){
                break;
            } 
             System.out.println("entered number is :"+ num);
        }while(true);
    }
}