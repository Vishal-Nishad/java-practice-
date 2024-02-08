import java.util.Scanner;
public class finocci{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int a = 0;
        int b= 1;
        int count=2;
        while (count<=n){
            int tmp=b;
            b = b+a;
            a=tmp;
            count ++;
            
        } System.out.println(b);
    }
}