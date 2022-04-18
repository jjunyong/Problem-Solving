package inflearn.string;

import java.util.Scanner;

public class CaseConvert {
//    public static void main(String[] args){
//        System.out.println("인풋을 입력사면 대,소문자를 변경한 결과를 출력합니다 : ");
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//
//        System.out.println(solution(str));
//
//    }

    private static String solution(String str) {

        String result="";
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)){
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

        return result;
    }
}
