package BarkingDog.Stack;

//정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//        명령은 총 다섯 가지이다.
//
//        push X: 정수 X를 스택에 넣는 연산이다.
//        pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        size: 스택에 들어있는 정수의 개수를 출력한다.
//        empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//        top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.


import java.io.*;
import java.util.*;

public class StackProblem {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {

            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    int data = Integer.parseInt(st.nextToken());
                    stack.push(data);
                    break;

                case "top":
                    if(!stack.isEmpty()){
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if(stack.isEmpty()){
                        System.out.println(1);
                    } else{
                        System.out.println(0);
                    }
                    break;

                case "pop":
                    if(!stack.isEmpty()){
                        System.out.println(stack.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
