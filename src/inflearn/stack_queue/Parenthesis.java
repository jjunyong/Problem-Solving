package inflearn.stack_queue;
import java.util.*;

public class Parenthesis{
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        if ( (n % 4 == 0 && n%10 !=0) || n%400==0){
            System.out.println("1");
        } else{
            System.out.println("0");
        }
    }
}