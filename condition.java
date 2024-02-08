import java.util.Scanner;
public class condition{
    public static void main(String [] args)
    {
        Scanner b =new Scanner(System.in);
        int a = b.nextInt();
        if (a>=20000){
            a = a+3000;
            System.out.println(a);
        } else if (a>=10000){
            a = a+2000;
            System.out.println(a);
        } else {
            a+= 1000;
            System.out.println(a);
        }
        int c=1;
        while(c<=5){
            System.out.println(c);
            c++;

        }
        for(int d=1;d<=5;d++){
            System.out.println(d);
        }

        }
    }
