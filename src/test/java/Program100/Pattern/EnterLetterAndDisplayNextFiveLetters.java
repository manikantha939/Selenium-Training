package Program100.Pattern;

import java.util.Scanner;

public class EnterLetterAndDisplayNextFiveLetters
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        char ch=scanner.next().charAt(0);
        for (int i=1;i<=5;i++){
            ch++;
            if(ch>'z'){
                ch='A';
            }
            if(ch>'Z'&& ch<'a'){
                ch='a';
            }
            System.out.print(ch);
        }
    }
}
