//Q. 두 정수를 입력받은 다음, A/B를 출력하는 프로그램
package main.java.Baekjoon.Level_1;

import java.util.Scanner;

public class Q1008 {
    public static void main(String[] args) {
        //scanner 객체 생성
        //System.in: 사용자로부터 키 입력 받음
        Scanner sc = new Scanner(System.in);

        //입력받은 값을 double형으로 반환함
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        //A/B한 값을 출력
        System.out.println(A / B);
    }
}
