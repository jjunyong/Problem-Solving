package inflearn.twoPointer_slidingWindow;

import java.util.Scanner;

public class PartialSequence {

    public static void main(String[] args){
        PartialSequence T = new PartialSequence();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr, n , m));
    }

    public int solution(int[] arr, int n, int m) {

        int lt = 0;
        int rt = 0;
        int answer = 0;
        int sum = 0;

        while(rt < n){

            sum += arr[rt];

            if( sum < m ){
                rt++;
            }
            else if ( sum > m ){
                sum -= arr[rt];
                sum -= arr[lt];
                lt++;
            } else {
                answer++;
                sum -= arr[lt];
                lt++;
                rt++;
            }
        }

        return answer;
    }
}
