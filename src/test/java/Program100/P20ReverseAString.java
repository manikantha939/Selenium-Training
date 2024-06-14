package Program100;

import java.util.Scanner;

public class P20ReverseAString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String to reverse: ");
        String str=scanner.next();
        System.out.println("Reversed String is: "+reverse(str));
    }

//    private static String reverse(String str) {
//        String nstr="";
//        char ch;
//        for(int i=0;i<str.length();i++){
//            ch=str.charAt(i);
//            nstr=ch+nstr;
//        }
//        return nstr;
//    }
    public static String reverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return  sb.reverse().toString();
    }

}
