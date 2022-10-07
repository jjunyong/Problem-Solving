import java.util.*;

public class BT {

    public static void main(String[] args){

        BT T = new BT();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));


    }

    public int solution(int n){

        int ans  = -1;
        for(int i=0;i<=n/3;i++){

            for(int j=0;j<=n/5;j++){
                if( n == 3*i + 5*j){
                    if( ans > i+j || ans == -1){
                        ans = i+j;
                    }
                }

            }
        }

        return ans;
    }

}
