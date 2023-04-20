//Q. 세가지 수의 A, B, C에 대한 "A + B + C"을 계산하는 프로그램(입력은 각 수 사이에 공백을 둠)(1 ≤ A, B, C ≤ 10의 12승)
package main.java.Baekjoon.Level_1;

import java.util.Scanner;

public class Q11382 {
    public static void main(String[] args) {
        //scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //세 수 A, B, C에 대한 객체 생성(int형 범위를 초과함으로 long타입 객체 생성)
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        //A + B + C의 결과값 출력
        System.out.println(A + B + C);
    }
}
