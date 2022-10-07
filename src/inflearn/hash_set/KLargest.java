package inflearn.hash_set;

import java.util.*;

//TreeSet : 중복을 제거하고, 정렬까지 됨 ( RB tree )
//TreeMap : HashMap에서 정렬이 필요하다면 사용

public class KLargest {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        KLargest T = new KLargest();

        int n = kb.nextInt();
        int k =  kb.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr){

        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        int ans=-1;


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int l=j+1;l<n;l++){
                    ts.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }

        int cnt=0;
        for(int i: ts){
            if(cnt==k-1){
                ans = i;
            }
            cnt++;
        }

        return ans;

    }

}
