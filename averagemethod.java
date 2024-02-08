import java.util.Scanner;
public class averagemethod{
    public static int average(){
        int ans=0;
        int c=1;
        int fin=0;
        while(c<=3){
            System.out.print("enter your number.");
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            ans=ans+n;
            fin=ans/c;
            c++;
            }
        return fin;
    }
    public static void main(String args[])
    {
        System.out.println("average of entered number is :"+average());
    }
}