package inflearn.string.arrays;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rank {

    public static void main(String[] args){
        Rank T = new Rank();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());
        if(!(3<= n && n<= 100)) return;

        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = Integer.parseInt(kb.next());
        }

        for(int x : T.solution(s)){
            System.out.print(x+" ");
        }
    }

    public int[] solution(int[] s){

        int[] ans = new int[s.length];

        for(int i=0;i<s.length;i++){

            int rank = 1;
            for(int j=0;j<s.length;j++){
                if(j==i) continue; // 자기 자신은 pass
                if(s[i] < s[j]) rank++;
            }
            ans[i] = rank;
        }

        return ans;
    }


}
