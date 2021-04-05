package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        StackByArray stack = new StackByArray(10);
        System.out.println("請依序存入10筆資料");
        for (int i = 0; i < 10; i++) {
            stack.push(Integer.parseInt(userInput.readLine()));
        }
        System.out.println("========================");
        while (!stack.isEmpty()){
            System.out.println("依序取出的值為 : "+stack.pop());
        }
    }
}
