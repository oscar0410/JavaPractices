package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] A = {{1,3,5},{7,9,11},{13,15,17}};
        int[][] B = {{2,4,6},{8,10,12},{14,16,18}};
        int[][] C = new int[3][3];

        System.out.println("A矩陣 :");
        printArray(A);
        System.out.println("B矩陣 :");
        printArray(B);
        MatrixAdd(A,B,C);
        System.out.println("C矩陣 :");
        printArray(C);
    }

    private static void MatrixAdd(int[][] arr1, int[][] arr2, int[][] arr3) {
        if (arr1.length<=0 || arr2.length<=0){
            System.out.println("矩陣維數必須大於0");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
