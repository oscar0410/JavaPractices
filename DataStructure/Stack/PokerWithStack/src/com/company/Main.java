package com.company;

public class Main {
    static int top = -1;

    public static void main(String[] args) {
        int[] card = new int[52];
        int[] stack = new int[52];

        for (int i = 0; i < 52; i++) {
            card[i] = i;
        }

        System.out.println("洗牌中...");
        int k = 0;
        while (k < 30) {
            for (int i = 0; i < 51; i++) {
                for (int j = i + 1; j < 52; j++) {
                    if (((int) (Math.random() * 5)) == 2) {
                        int test;
                        test = card[i];
                        card[i] = card[j];
                        card[j] = test;
                    }
                }
            }
            k++;
        }
        int index = 0;
        while (index != 52) {
            push(stack, 52, card[index]);
            index++;
        }
        System.out.println("[逆時針發牌]");
        System.out.println("[顯示各家手牌]");
        System.out.println("東家\t\t北家\t\t西家\t\t南家");
        System.out.println("==========================================");
        while (top >= 0) {
            int style = stack[top] / 13;
            String asc = null;
            switch (style) {
                case 0:
                    asc = "梅花";
                    break;
                case 1:
                    asc = "方塊";
                    break;
                case 2:
                    asc = "紅心";
                    break;
                case 3:
                    asc = "黑桃";
                    break;
                default:
                    break;
            }
            System.out.print("[" + asc + (stack[top] % 13 + 1) + "]\t");
            if(top%4==0){
                System.out.println();
            }
            top--;
        }
    }

    private static void push(int[] stack, int Max, int val) {
        if(top>=Max-1){
            System.out.println("堆疊已滿!!!");
        }else{
            top++;
            stack[top]=val;
        }
    }
}
