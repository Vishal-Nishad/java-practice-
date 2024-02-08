import java.util.Scanner;
public class temptoF{
    public static void main(String[] args){
        Scanner temp= new Scanner(System.in);
        float c = temp.nextFloat();
        float F = (c * 9/5)+32;
        System.out.println(F);
    }
}