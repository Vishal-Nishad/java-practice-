import java.util.Scanner;
public class average{
    public static void main(String args[]){
        int sum=0;
        
        int count=0;
        while (count<3){
            System.out.println("enter marks : ");
            Scanner in =new Scanner(System.in);
            int a =in.nextInt();
            sum=sum+a;
            count ++;
        }System.out.println("the sum of all number is :
        "+sum); 
        System.out.println("total entered number is :"+count); 
        System.out.println("average is :"+sum/count);
        
        // ans =sum/count;
        // System.out.println(ans);
    }
}
