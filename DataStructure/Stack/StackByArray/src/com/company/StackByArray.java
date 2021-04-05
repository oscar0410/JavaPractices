package com.company;

// 以陣列模擬推疊
public class StackByArray {
    //陣列
    private int[] stack;
    // 堆疊頂端的索引
    private int top;

    public StackByArray(int size) {
        stack = new int[size];
        top = -1;
    }

    // push 方法
    public void push(int data){
        if(top>=stack.length){
            System.out.println("堆疊已滿!!!");
        }else{
            stack[++top] = data;
        }
    }

    // isEmpty()方法
    public boolean isEmpty(){
        return top == -1;
    }

    // pop 方法
    public int pop(){
        if (this.isEmpty()){
            return -1;
        }
        else{
            return stack[top--];
        }
    }
}
