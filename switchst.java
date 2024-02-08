import java.util.Scanner;
public class switchst{
    public static void main(String args[]){
        System.out.println("enter a fruit name. ");
        Scanner in =new Scanner(System.in);
        String fruit=in.next();
        switch(fruit){
            case "apple": System.out.println("a red sweet fruit.");
                break;
            case "mango": System.out.println("king of fruit.");
                break;
            case "banana": System.out.println("healthy fruit.");
                break;
            case "grapes": System.out.println("sour in test .");
                break;
            default : System.out.println("enter a valid fruit name.");
        }
    }
}