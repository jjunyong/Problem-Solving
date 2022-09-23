package inflearn.string;

import java.util.Scanner;

/*
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 알파벳만 뒤집고
특수문자는 자기자리 그대로 있는 문자렬 출력하는 프로그램
 */
public class ReverseSpecificCharacter {

    public static void main(String[] args) {
        ReverseSpecificCharacter T = new ReverseSpecificCharacter();
        Scanner kb = new Scanner(System.in);
        String input = kb.next();

        System.out.println(T.reverseSpecificCharacter(input));
    }

    private String reverseSpecificCharacter(String input) {

        char[] inputCharList = input.toCharArray();
        int size = inputCharList.length;
        for(int i=0;i<size/2;i++){
            if(Character.isAlphabetic(inputCharList[i]) && Character.isAlphabetic(inputCharList[size-i-1])){
                char tmp = inputCharList[size-i-1];
                inputCharList[size-i-1] = inputCharList[i];
                inputCharList[i] = tmp;
            }
        }

        return new String(inputCharList);
    }

}
