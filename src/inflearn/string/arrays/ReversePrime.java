package inflearn.string.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrime {

    public static void main(String[] args){
        ReversePrime T = new ReversePrime();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = kb.next();
        }

        for(int x : T.solution(s)){
            System.out.print(x+" ");
        }

    }

    public List<Integer> solution(String[] s) {

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length;i++){
            String reversedString = new StringBuilder(s[i]).reverse().toString();
            int reversedNum = Integer.parseInt(reversedString);
            if(isPrime(reversedNum)){
                ans.add(reversedNum);
            }
        }
        return ans;
    }

    public boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<n;i++){
           if(n % i ==0) return false;
        }
        return true;
    }
}
