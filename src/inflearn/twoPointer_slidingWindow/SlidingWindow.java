package inflearn.twoPointer_slidingWindow;

import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args){
        SlidingWindow T = new SlidingWindow();

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

        int sum = 0;
        int answer = 0;

        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        for(int i=k;i<n;i++){
            if( answer < sum ) {
                answer = sum;
            }
            sum = sum - arr[i-k] + arr[i];

        }

        return answer;
    }
}
