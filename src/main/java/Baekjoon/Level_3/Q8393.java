//Q. n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
package main.java.Baekjoon.Level_3;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        // n 객체 생성
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        //1부터 n까지 합 계산
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
