package inflearn.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {

    public static List<String> reverseWord1(int n, String[] strs){
        ArrayList<String> answer = new ArrayList<>();
        for(String s : strs){
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static List<String> reverseWord2(int n, String[] strs){ //직접 뒤집
        ArrayList<String> answer = new ArrayList<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            int lt = 0;
            int rt = chars.length-1;

            while(lt<rt){
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(chars));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i]=kb.next();
        }
        for(String s : reverseWord2(n,strs)){
            System.out.println(s);
        }
    }
}
