package inflearn.twoPointer_slidingWindow;

import java.util.Scanner;

public class LongestSequence {

    public static void main(String[] args){
        LongestSequence T = new LongestSequence();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr, n , k));
    }

    public int solution(int[] arr, int n, int k) {

        int lt = 0;
        int answer = 0;
        int sum = 0;

        int cnt = 0;

        for(int rt=0;rt<n;rt++){

            if (arr[rt] == 0) {
                cnt++;
            }
            while( cnt > k ){
                if( arr[lt++] == 0 ){
                    cnt--;
                }
            }

            sum = rt-lt+1;
            if(answer < sum){
                answer = sum;
            }
        }
        return answer;
    }
}
