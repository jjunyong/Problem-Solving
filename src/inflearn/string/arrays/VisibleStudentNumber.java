package inflearn.string.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VisibleStudentNumber {

    public static void main(String[] args){
        VisibleStudentNumber T = new VisibleStudentNumber();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.next());

        if(!(5 <= n && n<= 100000)){
            System.out.println("input error");
            return;
        }

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(kb.next());
        }

        System.out.println(T.solution(a));

    }

    public int solution(int[] a) {

        int cnt = 1;
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min < a[i]) {
                min = a[i];
                cnt++;
            }
        }

        return cnt;
    }
}
