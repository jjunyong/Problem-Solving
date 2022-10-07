package BarkingDog.LinkedList;

import java.util.*;
import java.io.*;
import static java.lang.System.currentTimeMillis;

public class KeyLogger {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        KeyLogger T = new KeyLogger();

        int n = Integer.parseInt(br.readLine());

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }

        for(int i=0;i<n;i++) {
            for(char c: T.solution(strs[i])){
                bw.write(c);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public List<Character> solution(String s){

        List<Character> list = new LinkedList<>();
        ListIterator<Character> iter = list.listIterator();

        for(char x: s.toCharArray()){
            if(x=='<'){
                if(iter.hasPrevious()){
                    iter.previous();
                }
                continue;
            } else if( x== '>'){
                if(iter.hasNext()){
                    iter.next();
                }
                continue;
            } else if( x=='-'){
                if(iter.hasPrevious()){
                    iter.previous();
                    iter.remove();
                }
                continue;
            }
            iter.add(x);
        }

        return list;
    }

}