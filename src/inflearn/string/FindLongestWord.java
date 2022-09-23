package inflearn.string;

import java.util.Scanner;

public class FindLongestWord {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution2(str));
    }

    public static String solution(String str) { // split 사용한 솔루션

        String[] parsedStr = str.split(" ");

        String maxStr=parsedStr[0];
        for(int i=0;i<parsedStr.length-1;i++){
            if(maxStr.length() < parsedStr[i+1].length()){
                maxStr = parsedStr[i+1];
            }
        }

        return maxStr;
    }

    private static String solution2(String str){ //indexOf와 substring사용한 솔루션

        String answer = "";
        int min = 0;
        int pos;
        while((pos=str.indexOf(' '))!=-1){
            String s = str.substring(0,pos);

            if(min < s.length()){
                answer = s;
                min = s.length();
            }

            str=str.substring(pos+1);
        }

        if(answer.length() < str.length()){
            answer = str;
        }

        return answer;
    }
}
