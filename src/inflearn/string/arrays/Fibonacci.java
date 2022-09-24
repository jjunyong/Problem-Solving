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
    }
}
