package Program100.Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=scanner.nextInt();

        List<String> ans=new ArrayList<>();
        for (int i=1; i<=num;i++){
            if(i%15==0){
                ans.add("FizzBuzz");
            } else if (i%3==0) {
                ans.add("Fizz");
            } else if (i%5==0) {
                ans.add("Buzz");
            }else {
                ans.add(String.valueOf(i));
            }
        }
        scanner.close();
        System.out.println(ans);

    }
}
