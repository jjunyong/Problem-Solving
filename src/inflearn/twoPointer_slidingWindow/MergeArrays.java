package inflearn.twoPointer_slidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args){
        MergeArrays T = new MergeArrays();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = kb.nextInt();
        }

        for(int x: T.solution(arr1,arr2,n,m)){
            System.out.print(x+" ");
        }
    }

    public List<Integer> solution(int[] arr1, int[] arr2, int n, int m){
        int p1=0;
        int p2=0;

        List<Integer> answer = new ArrayList<>();

        while(p1<n && p2<m){
            if(arr1[p1]<arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
            } else {
                answer.add(arr2[p2]);
                p2++;
            }
        }

        while(p1<n){
            answer.add(arr1[p1]);
            p1++;
        }
        while(p2<m){
            answer.add(arr2[p2]);
            p2++;
        }

        return answer;

    }
}
