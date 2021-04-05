package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入盤子數量 :");
        String str = userInput.readLine();
        int disc = Integer.parseInt(str);
        hanoi(disc, 1, 2, 3);

    }

    private static void hanoi(int disc, int p1, int p2, int p3) {
        if (disc == 1) {
            System.out.println("盤子" + disc + ",從塔" + p1 + "移到塔" + p3);
        } else {
            hanoi(disc - 1, p1, p3, p2);
            System.out.println("盤子" + disc + ",從塔" + p1 + "移到塔" + p3);
            hanoi(disc - 1, p2, p1, p3);
        }
    }
}
