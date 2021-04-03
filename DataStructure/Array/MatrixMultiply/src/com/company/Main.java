package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 矩陣1的維度 MxN
        // 矩陣2的維度 NxP
        int M,N,P,tmp;
        String strM,strN,strP;
        BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
        // 矩陣1
        System.out.println("矩陣A的維數");
        System.out.print("M :");
        strM = keyin.readLine();
        M = Integer.parseInt(strM);
        System.out.print("N :");
        strN = keyin.readLine();
        N =Integer.parseInt(strN);
        int [][] A = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                tmp = Integer.parseInt(keyin.readLine());
                A[i][j] = tmp;
            }
        }
        // 矩陣2
        System.out.println("矩陣B的維數");
        System.out.print("N :");
        strN = keyin.readLine();
        N = Integer.parseInt(strN);
        System.out.print("P :");
        strP = keyin.readLine();
        P =Integer.parseInt(strP);
        int [][] B = new int[N][P];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                tmp = Integer.parseInt(keyin.readLine());
                B[i][j] = tmp;
            }
        }

        MatrixMultiply(A,B);
    }

    private static void MatrixMultiply(int[][] a, int[][] b) {
        if(a[0].length != b.length){
            System.out.println("兩個矩陣無法進行相乘");
            return;
        }else if(a.length<=0 || a[0].length<=0 || b[0].length <=0){
            System.out.println("維數必須大於0");
        }
        int rows = a.length;
        int cols = b[0].length;
        int tmpNums = b.length;
        int [][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int tmp = 0;
                for (int k = 0; k < tmpNums; k++) {
                    tmp += a[i][k] * b[k][j];
                }
                C[i][j] = tmp;
            }
        }

        System.out.println("矩陣相乘後的結果 : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
