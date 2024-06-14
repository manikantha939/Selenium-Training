package Program100;

import java.util.HashMap;
import java.util.Scanner;

public class toRemoveAllWhiteSpacesFromAStringWithoutUsingReplace {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.next();
        String input=" hello     achha    hi    bye ";
//
//
//        char [] chars=input.toCharArray();
//        StringBuffer stringBuffer=new StringBuffer();
//        for (int i=0; i<chars.length;i++){
//            if((chars[i]!=' ') && (chars[i]!='\t') && (chars[i]!='\n')){
//                stringBuffer.append(chars[i]);
//            }
//        }
//        System.out.println(stringBuffer);

//        StringBuilder stringBuilder=new StringBuilder();
//        boolean isPrevSpace= false;

//        for (int i=0; i<input.length();i++){
//            char currentChar=input.charAt(i);
//
//            if(Character.isWhitespace(currentChar)){
//                if(!isPrevSpace){
//                    stringBuilder.append(' ');
//                    isPrevSpace=true;
//                }
//            }else {
//                stringBuilder.append(currentChar);
//                isPrevSpace=false;
//            }
//        }
//        System.out.println(stringBuilder.toString().trim());

//        StringBuilder stringBuilder=new StringBuilder();
//        boolean isPrevSpace= false;
//
//        for (int i=0;i<input.length();i++){
//            char currentChar=input.charAt(i);
//
//            if(currentChar!=' '){
//                stringBuilder.append(currentChar);
//                isPrevSpace=false;
//            }else if (!isPrevSpace){
//                stringBuilder.append(' ');
//                isPrevSpace=true;
//            }
//        }
//        System.out.println(stringBuilder.toString().trim());

        String result=input.replaceAll("\\s+", " ").toString().trim();
        System.out.println(result);



    }
}