//Q. 두 정수(A,B)가 주어졌을 때, 비교하는 프로그램
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q1330 {
    public static void main(String[] args) {
        //두 정수 A, B 객체 생성
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        //A가 B보다 큰 경우 = '>' 출력
        if(A > B) System.out.println('>');
        //A가 B보다 작은 경우 = '<' 출력
        if(A < B) System.out.println('<');
        //A와 B가 같은 경우 = '==' 출력
        if(A == B) System.out.println("==");
    }
}
