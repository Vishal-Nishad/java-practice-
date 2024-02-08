import java.util.Scanner;
public class evenoroddsum{
    public static void main(String args[]){
        int evensum=0;
        int oddsum=0;
        int choice;
        int num;
        do{ System.out.println("enter number: ");
            Scanner in=new Scanner(System.in);
            num=in.nextInt();
            if (num%2==0){
                evensum=num+evensum;
            } else{
                oddsum=num+oddsum;
            }
            System.out.println("enter 1 for continue or enter 0 for end.");
            choice=in.nextInt();
        
        }while(choice==1);
        System.out.println("even sum is : "+evensum);
        System.out.println("odd sum is : "+oddsum);
    }
}