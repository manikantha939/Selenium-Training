package Program100;

public class P21SwapTwoNumber {
    public static void main(String[] args) {
        //with third variable
        int a=5,b=10;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);

        //without third variable
        int c=10, d=20;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println(c+" "+d);
    }
}
