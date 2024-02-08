import java.util.Scanner;
public class weekno{
    public static void main(String args[]){
        System.out.println("enter a week number.");
        Scanner in =new Scanner(System.in);
        int dayno_=in.nextInt();
        switch(dayno_){
            case 1: System.out.println("monday");
                break;
            case 2: System.out.println("tuesday");
                break;
            case 3: System.out.println("wednesday");
                break;
            case 4: System.out.println("thursday");
                break;
            case 5: System.out.println("friday");
                break;
            case 6: System.out.println("saturday");
                break;
            case 7: System.out.println("sunday");
                break;
            default: System.out.println("enter a valid week number.");
                                            
        }
    }
}