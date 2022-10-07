package BarkingDog.LinkedList;

import java.util.*;
import java.io.*;
import static java.lang.System.currentTimeMillis;

public class YosephusSequence {
    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);

        YosephusSequence T = new YosephusSequence();

        int n = kb.nextInt();
        int k = kb.nextInt();

       T.solution(n,k);

    }

    public void solution(int n, int k) {

        List<Integer> list = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=1;i<=n;i++){
            q.add(i);
        }

        int i=1;
        System.out.print("<");
        while(!q.isEmpty()){
            if(i==k){
                if(q.size()==1){
                    System.out.print(q.poll());
                } else {
                    System.out.print(q.poll()+", ");
                }
                i=0;
            } else {
                q.add(q.poll());
            }
            i++;
        }
        System.out.print(">");

    }

}