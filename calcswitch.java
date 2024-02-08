import java.util.Scanner;
public class calcswitch{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter first number :");
        int num1=in.nextInt();
        System.out.println("enter second number :");
        int num2=in.nextInt();
        System.out.println("enter operator :");
        char op=in.next().charAt(0);

        switch(op){
            case '+': System.out.println(num1+num2);
                break;
            case '-': System.out.println(num1-num2);
                break;
            case '*': System.out.println(num1*num2);
                break;
            case '%': System.out.println(num1%num2);
                break;
            case '/': System.out.println(num1/num2);
                break;
            default : System.out.println("enter a valid operator. ");
        }

    }
}