package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 建立LinkedList
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int num;
        String name;
        int score;

        System.out.println("請輸入5筆學生資料 :");
        LinkedList list = new LinkedList();
        for (int i = 1; i < 6; i++) {
            System.out.print("請輸入座號 :");
            num = Integer.parseInt(buf.readLine());
            System.out.print("請輸入姓名 :");
            name = buf.readLine();
            System.out.print("請輸入成績 :");
            score = Integer.parseInt(buf.readLine());
            list.insert(num,name,score);
            System.out.println("-----------------");
        }
        System.out.println("學生成績");
        System.out.println(" 座號 姓名 成績==================");
        list.print();
    }
}
