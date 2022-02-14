package doit_java;

import java.util.Scanner;

public class median {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("세 정수 중앙값 구하기");

        System.out.println("a값 입력: ");
        int a = stdIn.nextInt();
        System.out.println("b값 입력: ");
        int b = stdIn.nextInt();
        System.out.println("c값 입력: ");
        int c = stdIn.nextInt();

        System.out.println("세 정수의 중앙값은 "+getMedian(a,b,c)+"입니다.");

    }

    private static int getMedian(int a, int b, int c){

        if(a>=b){
            if(b>=c){
                return b;
            }
            else if(a<=c){
                return a;
            }
            else{
                return c;
            }
        }else if(a>c){
            return a;
        }else if(b>c){
            return c;
        }
        else{
            return b;
        }
    }

}
