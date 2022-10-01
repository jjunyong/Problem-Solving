package inflearn.hash_set;

import inflearn.string.Palindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        Anagram T = new Anagram();

        String s1 = kb.next();
        String s2 = kb.next();

        char[] a = s1.toCharArray();
        char[] b = s1.toCharArray();

        System.out.println(T.solution(a,b));
    }

    public String solution(char[] a, char[] b){

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        for(char x : a){
            mapA.put(x, mapA.getOrDefault(x,0)+1);
        }
        for(char x : b){
            mapB.put(x, mapB.getOrDefault(x,0)+1);
        }

        if(mapA.equals(mapB)){
            return "YES";
        }

        return "NO";

    }

}
