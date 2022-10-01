package inflearn.string.twoPointer_slidingWindow;

import java.util.Scanner;

public class ConsecutiveSum {

    public static void main(String[] args){
        ConsecutiveSum T = new ConsecutiveSum();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {

        int lt = 0;
        int sum = 0;
        int cnt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];

        for(int i=0;i<m;i++){
            arr[i] = i+1;
        }

        for(int rt=0; rt<m;rt++){
            sum += arr[rt];

            if(sum == n) cnt++;
            while( sum >= n ){
                sum -= arr[lt++];
                if(sum==n) cnt++;
            }

        }
        return cnt;
    }
}
