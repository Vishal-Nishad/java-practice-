import java.util.Scanner;
public class scanif{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        for(int num =50;num<=n;num+=100){
            System.out.println(num);
        }
    }
}