package Program100;

public class P22VowelCheck {
    public static void main(String[] args) {
        String str="Hello";
        if(containsVowel(str)){
            System.out.println("Vowel is Present");
        }else {
            System.out.println("Vowel is not Present");
        }
    }

    private static boolean containsVowel(String str) {
        return str.matches(".*[aeiouAEIOU]*.");
    }
}
