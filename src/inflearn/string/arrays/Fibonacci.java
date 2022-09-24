package inflearn.string.arrays;


import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        Fibonacci T = new Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        for(int x : T.solution(n)){
            System.out.print(x+" ");
        }

    }

    public int[] solution(int n) {
        int[] ans = new int[n];
        ans[0] = 1;
        ans[1] = 1;
        for(int i=2;i<n;i++){
            ans[i] = ans[i-1] + ans[i-2];
        }

        return ans;
    }
}
