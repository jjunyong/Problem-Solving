package BarkingDog.Stack;

import java.util.*;

public class MyStack<T> {

    private T[] elements;
    private int size;
    private int index = 0;

    public MyStack(int size){
        this.size = size;
        elements = (T[]) new Object[size];
    }
    public T pop(){
        T data = elements[index-1];
        index--;
        return data;
    }

    public void push(T data){
        if(index > size-1){
            System.out.println("Stack이 꽉 찼습니다.");
            return;
        }
        elements[index++] = data;
        System.out.println("Stack에 "+data+" 원소 추가!");
    }

    public T get() {
        return elements[index-1];
    }

    public int elementSize(){
        return index;
    }

}

class Main{
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        MyStack<Integer> integerMyStack = new MyStack<>(size);

        integerMyStack.push(10);
        System.out.println(integerMyStack.pop());
        integerMyStack.push(20);
        integerMyStack.push(30);
        integerMyStack.push(40);
        System.out.println(integerMyStack.pop());
        System.out.println(integerMyStack.elementSize());
        System.out.println(integerMyStack.pop());
        System.out.println(integerMyStack.pop());


    }
}
