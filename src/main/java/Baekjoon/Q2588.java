//Q. (세 자리 수)*(세 자리 수)의 곱셈에서 각 자리수 곱셈에 대한 값과, 결과 값에 대해 출력하는 프로그램
package main.java.Baekjoon;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        //scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //두 수(세자리 수)를 입력받음
        int A = sc.nextInt();
        int B = sc.nextInt();

        //각 자리수 곱셈 값(일,십,백의 자리), 결과 값 순서대로 출력
        System.out.println(A *(B % 10)); //셋째자리(일)
        System.out.println(A *(B % 100 / 10)); //둘째자리(십)
        System.out.println(A *(B / 100)); //첫째자리(백)
        System.out.println(A * B);
    }
}
