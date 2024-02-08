import java.util.Scanner;
public class bill{
    public static void main(String args []){
        Scanner in =new Scanner(System.in);
        float pen=in.nextFloat();
        float pencil=in.nextFloat();
        float eraser=in.nextFloat();
        float gst=(18*(pen+pencil+eraser)/100);
        float bill=gst+pen+pencil+eraser;
        System.out.println(gst);
        System.out.println(bill);
    }
}