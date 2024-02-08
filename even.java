import java.util.Scanner;
public class even{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int i=2;
        while(i<=n){
        
            System.out.println(i);
             i=i+2;
        }
    }
}