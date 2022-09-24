package inflearn.string.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSum {

    public static void main(String[] args){
        MaxSum T = new MaxSum();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());
        if(!(2<= n && n<= 50)) return;

        int[][] s = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[i][j] = Integer.parseInt(kb.next());
            }
        }

        System.out.print(T.solution(s));

    }

    public int solution(int[][] s){

        int max = 0;

        int s1 = 0;
        int s2 = 0;

        for(int i=0;i<s.length;i++){

            int sum1=0;
            int sum2=0;
            for(int j=0;j<s.length;j++){
                sum1 = sum1 + s[i][j];
                sum2 = sum2 + s[j][i];
                if(i==j) s1 = s1 + s[i][j];
                if(i+j == s.length-1) s2 = s2 + s[i][j];
            }

            if(max<sum1) max = sum1;
            if(max<sum2) max = sum2;

        }

        if(max<s1) max = s1;
        if(max<s2) max = s2;

        return max;
    }


}
