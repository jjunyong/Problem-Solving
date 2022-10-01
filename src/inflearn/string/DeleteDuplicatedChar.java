package inflearn.string;

import java.util.Scanner;

/*
*
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.

예시 입력 1
ksekkset

예시 출력 1
kset
*
*/
public class DeleteDuplicatedChar {

    public static void main(String[] args) {
        DeleteDuplicatedChar T = new DeleteDuplicatedChar();
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(T.deleteDuplicatedChar(input));
    }

    public String deleteDuplicatedChar(String input) {
        char[] inputArr = input.toCharArray();
        String res="";
        for(int i=0;i<inputArr.length;i++){
            if(i==0){
                res += inputArr[i];
                continue;
            }
            if((input.substring(0,i-1).indexOf(inputArr[i])==-1)){
               res += inputArr[i];
            }
        }

        return res;
    }

    public String solution(String str){
        String res = "";
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == str.charAt(i)){
                res += str.charAt(i);
            }
        }
        return res;
    }
}
