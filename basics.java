import java.util.Scanner;
public class basics {
    public static void main(String[] args)
    {   int b,c,sum;
        Scanner a = new Scanner(System.in);
        b = a.nextInt();
        c = a.nextInt();
        sum = b+c;

        System.out.println(sum);
        if (sum>100){
            System.out.println("hello world");
        
        }

        int count = 2;
        while(count<=10){
            System.out.println(count);
            count ++;
        }
        for (int coun = 5; coun<=90;coun ++){
            System.out.println(coun);
        }
    }
}