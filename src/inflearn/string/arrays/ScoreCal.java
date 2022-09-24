package inflearn.string.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreCal {

    public static void main(String[] args){
        ScoreCal T = new ScoreCal();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());
        if(!(1<= n && n<= 100)) return;

        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = Integer.parseInt(kb.next());
        }

        System.out.println(T.solution(s));
    }

    public int solution(int[] s){

        int score = 0;
        int correctFlag = 1;

        for(int i=0;i<s.length;i++){
            if(s[i]==1){
                score = score + correctFlag;
                correctFlag++;
            } else {
                correctFlag = 1;
            }
        }

        System.out.println(score);

        return 0;
    }


}
