package inflearn.arrays;

import java.util.Scanner;

public class Mentoring {

    public static void main(String[] args){

        Mentoring T = new Mentoring();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[][] arr = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(m,n,arr));
    }

    public int solution(int m, int n, int[][] arr){

        int ans = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                int cnt = 0;

                for(int k=0;k<m;k++){
                    int pi=0;
                    int pj=0;
                    for(int s=0;s<n;s++){
                        if(arr[k][s] == i){
                            pi = s;
                        }
                        if(arr[k][s] == j){
                            pj = s;
                        }
                    }

                    if(pi<pj) cnt++;
                }
                if(cnt==m) ans++;
            }
        }

        return ans;
    }


}
