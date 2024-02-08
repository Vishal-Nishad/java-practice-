public class methods{
    public static void swap(int a ,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swap value of a = "+a);
        System.out.println("swap value of b = "+b);
    }
    public static void main (String args[]){
        int a=5;
        int b=10;
        swap(a,b);
        System.out.println("original value of a ="+a);
        System.out.println("original value of b ="+b);
    }
}