package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        StuLinkedList list = new StuLinkedList();
        int findword = 0;
        int[][] data = new int[12][10];
        String[] name = new String[]{"Allen","Scoot","Marry","Jon","Mark","Ricky","Lisa","Jasica","Hanson","Amy","Bob","Jack"};
        System.out.println("座號 成績 座號 成績 座號 成績 座號 成績\n");
        for (int i = 0; i < 12; i++) {
            data[i][0] = i+1;
            data[i][1] = (Math.abs(rand.nextInt(50)))+50;
            list.insert(data[i][0], name[i],data[i][1]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+data[j*3+i][0]+"]  ["+data[j*3+i][1]+"]    ");
            }
            System.out.println();
        }
        while (true){
            System.out.print("請輸入要刪除成績的座號, 結束輸入-1: ");
            findword = Integer.parseInt(buf.readLine());
            if (findword == -1){
                break;
            } else {
                Node currentNode = new Node(list.firstNode.data,list.firstNode.names,list.firstNode.np);
                currentNode.next = list.firstNode.next;
                while (currentNode.data != findword){
                    currentNode = currentNode.next;
                }
                list.delete(currentNode);
                System.out.println("刪除後的成績序列 :");
                list.print();
            }
        }
    }
}
