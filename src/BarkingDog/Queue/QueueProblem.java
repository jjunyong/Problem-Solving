package BarkingDog.Queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class QueueProblem {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Queue<Integer> Q = new LinkedList<>();

        int last = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    Q.add(last);
                    break;
                case "front":
                    if(Q.isEmpty()) System.out.println(-1);
                    else System.out.println(Q.peek());
                    break;
                case "back":
                    if(Q.isEmpty()) System.out.println(-1);
                    else System.out.println(last);
                    break;
                case "size":
                    System.out.println(Q.size());
                    break;
                case "empty":
                    if(Q.isEmpty()) System.out.println(1);
                    else  System.out.println(0);
                    break;
                case "pop":
                    if(Q.isEmpty()) System.out.println(-1);
                    else System.out.println(Q.poll());
                    break;
            }

        }

        bw.flush();
        bw.close();
    }
}
