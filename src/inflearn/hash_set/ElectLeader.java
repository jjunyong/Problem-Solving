package inflearn.hash_set;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElectLeader {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        ElectLeader T = new ElectLeader();

        int n = kb.nextInt();
        String str = kb.next();

        char[] arr = str.toCharArray();

        System.out.println(T.solutionLecture(n, arr));
    }

    public char solutionLecture(int n, char[] arr){

        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x: arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int max = 0;

        for(char key : map.keySet()){
            if ( max < map.get(key)){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public char solution(int n, char[] arr){

        int ans = 0;
        HashMap<Character, Integer> hMap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(hMap.get(arr[i]) == null){
                hMap.put(arr[i], 1);
            } else {
                int cnt = hMap.get(arr[i]);
                hMap.put(arr[i], cnt+1);
            }
        }

        int maxValue = 0;
        char maxKey = 0;

        for(Map.Entry<Character, Integer> entry : hMap.entrySet()){
            if(maxValue < entry.getValue()){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }


}
