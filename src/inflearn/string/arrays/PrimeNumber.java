package inflearn.string.arrays;


import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){
        PrimeNumber T = new PrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        if(n<2){
            return;
        }

        System.out.println(T.solution(n));

    }

    public int solution(int n) {

        // 전체 숫자 배열에 할당
        int[] chae = new int[n+1];
        for(int i=2;i<n+1;i++){
            chae[i] = i;
        }

        int cnt = n-1;
        Long m = Math.round(Math.sqrt(n));

        for(int i=2;i<m+1;i++){
            for(int j=i;j<n+1;j++){
                if(chae[j] % i == 0 && chae[j] != i ){
                    chae[j] = -1;
                    cnt--;
                }
            }
        }

        return cnt;
    }
}
