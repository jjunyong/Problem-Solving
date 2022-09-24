package inflearn.string.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Peaks {

    public static void main(String[] args){
        Peaks T = new Peaks();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());
        if(!(2<= n && n<= 50)) return;

        int[][] s = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                s[i][j] = Integer.parseInt(kb.next());
            }
        }

        System.out.print(T.solution2(s));

    }

    public int solution(int[][] s){

        int[][] newS = new int[s.length+2][s.length+2];

        for(int i=0;i<s.length+2;i++){
            for(int j=0;j<s.length+2;j++){
                if(i==0 || j==0 || i==s.length+1 || j==s.length+1){
                    newS[i][j] = 0;
                } else{
                    newS[i][j] = s[i-1][j-1];
                }
            }
        }

        int cnt=0;

        for(int i=1;i<newS.length-1;i++){
            for(int j=1;j<newS.length-1;j++) {

                if (newS[i][j] > newS[i-1][j] && newS[i][j] > newS[i][j-1] && newS[i][j] > newS[i][j+1] && newS[i][j] > newS[i + 1][j]){
                    cnt++;
                }

            }
        }

        return cnt;
    }

    public int solution2(int[][] s){

        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, -1, 0 , 1 };

        int answer = 0;

        for(int i=0;i<s.length;i++){
            for(int j=0;j<s.length;j++){

                boolean flag = true;
                for(int k=0;k<4;k++){
                    int nx = i + dx[k];  //nx : next x
                    int ny = j + dy[k];

                    if(0<=nx && nx< s.length && 0<= ny && ny<s.length && s[nx][ny] >= s[i][j] ) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }


}
