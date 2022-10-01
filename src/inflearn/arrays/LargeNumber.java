package inflearn.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args){
        LargeNumber T = new LargeNumber();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(kb.next());
        }

        for(int x: T.solution(a)){
            System.out.print(x+" ");
        }
    }

    public List<Integer> solution(int[] a) {
        List<Integer> ans = new ArrayList<>();

        ans.add(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] < a[i]) {
                ans.add(a[i]);
            }
        }

        return ans;
    }
}
