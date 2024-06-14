package Program100.Pattern;

public class ReverseANumber {
	public static void main(String[] args) {
		int number=12345;
		int rev_num=0;

        while(number>0) {
            System.out.println(rev_num*10);
            System.out.println(number%10);
            rev_num = rev_num*10+number % 10;
            System.out.println("-----------------------------");
            System.out.println(rev_num);
            number = number / 10;
            System.out.println(number);
        }
        System.out.println(rev_num);

	}
}
