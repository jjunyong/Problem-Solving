package inflearn.string;

import java.util.Scanner;

/*
설명

앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.

문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.

단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.

알파벳 이외의 문자들의 무시합니다.


입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.


출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.


예시 입력 1

found7, time: study; Yduts; emit, 7Dnuof
예시 출력 1

YES
 */
public class Palindrome2 {

    public static void main(String[] args){
        Palindrome2 T = new Palindrome2();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(T.solution(input));
    }

    public String solution(String str){
        str = str.toUpperCase().replaceAll("[^A-Z]",""); // replaceAll을 써야 정규식을 쓸 수 있다. ^가 ! 랑 같은 의
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println(reverse);
        if(str.equalsIgnoreCase(reverse)){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
