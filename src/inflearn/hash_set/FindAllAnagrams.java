package inflearn.hash_set;

import java.util.*;

public class FindAllAnagrams {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        FindAllAnagrams fa = new FindAllAnagrams();

        String S = kb.next();
        String T = kb.next();

        char[] a = S.toCharArray();
        char[] b = T.toCharArray();

        System.out.println(fa.solution(a,b));
    }

    public int solution(char[] a, char[] b){

        int n = a.length;
        int k = b.length;
        int lt =0;
        int ans = 0;


        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for(int i=0;i<k;i++){
            mapB.put(b[i], mapB.getOrDefault(b[i], 0)+1);
            mapA.put(a[i], mapA.getOrDefault(a[i], 0)+1);
        }

        if(mapA.equals(mapB)) ans++;

        for(int rt=k;rt<n;rt++){

            int value = mapA.get(a[lt])-1;
            if(value == 0){
                mapA.remove(a[lt]);
            } else {
                mapA.put(a[lt], value);
            }
            mapA.put(a[rt], mapA.getOrDefault(a[rt], 0)+1);

            if(mapA.equals(mapB)) ans++;

            lt++;
        }

        return ans;

    }

}
