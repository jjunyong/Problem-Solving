package inflearn.hash_set;

import inflearn.string.Palindrome;

import java.util.*;

public class SalesNum {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        SalesNum T = new SalesNum();

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        T.solutionSlidingWindow(n, k, arr);
    }

    public List<Integer> solutionLecture(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        for(int i=0;i<k-1;i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }

        int lt =0;
        for(int rt=k-1;rt<n;rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);

            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);

            lt++;
        }
        return answer;
    }
    public void solutionSlidingWindow(int n, int k, int[] arr){


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }


        System.out.print(map.size()+" ");

        for(int i=k;i<n;i++){

            int value = map.get(arr[i-k])-1;
            if( value == 0 ){
                map.remove(arr[i-k]);
            } else {

            }

            map.put(arr[i], map.getOrDefault(arr[i], 0)
                    +1);

            System.out.print(map.size()+" ");
        }

    }

    public void solutionTimeLimitExceeded(int n, int k, int[] arr){

        for(int i=0;i<=n-k;i++){

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j=i;j<i+k;j++){
                map.put(arr[j], map.getOrDefault(arr[j], 0)+1);
            }

            System.out.print(map.size()+" ");

        }

    }

}
