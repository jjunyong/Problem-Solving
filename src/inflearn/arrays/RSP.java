package inflearn.arrays;

import java.util.Scanner;

public class RSP {

    public static void main(String[] args){
        RSP T = new RSP();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        if(!(1 <= n && n<= 100)){
            System.out.println("input error");
            return;
        }

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(kb.next());
        }
        for(int i=0;i<n;i++){
            b[i] = Integer.parseInt(kb.next());
        }

        for(char c : T.solution(a,b)){
            System.out.println(c);
        }

    }

    public char[] solution(int[] a, int[] b) {

        char[] ans = new char[a.length];

        for(int i=0;i<a.length;i++) {
            if (a[i] == 1 && b[i] == 2) ans[i] = 'B';
            else if (a[i] == 1 && b[i] == 3) ans[i] = 'A';
            else if (a[i] == 1 && b[i] == 1) ans[i] = 'D';

            else if (a[i] == 2 && b[i] == 2) ans[i] = 'D';
            else if (a[i] == 2 && b[i] == 3) ans[i] = 'B';
            else if (a[i] == 2 && b[i] == 1) ans[i] = 'A';

            else if (a[i] == 3 && b[i] == 2) ans[i] = 'A';
            else if (a[i] == 3 && b[i] == 3) ans[i] = 'D';
            else if (a[i] == 3 && b[i] == 1) ans[i] = 'B';
        }

        return ans;
    }
}
