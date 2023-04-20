//Q. N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램
//출력 : N*1부터 N*9까지 출력
package main.java.Baekjoon.Level_3;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        //N 객체 생성
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        //N * 1 부터 N * 9 까지 반복
        for(int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}
