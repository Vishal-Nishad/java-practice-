import java.util.Scanner;
public class naturalno{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int val=0;
    int sum=0;
    while (val<=n){
        sum=sum+val;
        val++;

    }System.out.println(sum);
}
}