package inflearn.string.arrays;

import java.util.Scanner;

public class TempLeader {

    public static void main(String[] args){

        TempLeader T = new TempLeader();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        int[][] s = new int[n+1][6];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                s[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(s, n));

    }

    public int solution(int[][] s, int n){

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for(int i=1;i<=n;i++){

            int cnt = 0 ;

            for(int j=1;j<=n;j++){
                for(int k=1;k<=5;k++){
                    if(s[i][k] == s[j][k]){
                        cnt++;
                        break;
                    }
                }
            }

            if(max<cnt){
                max = cnt;
                ans = i;
            }

        }

        return ans;
    }

}
