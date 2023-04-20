//Q. 1에서부터 6까지의 눈을 가진 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램
//규칙1: 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금
//규칙2: 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
//규칙3: 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {
        //3개 주사위에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //주사위1에서 나온 눈
        int B = sc.nextInt(); //주사위2에서 나온 눈
        int C = sc.nextInt(); //주사위3에서 나온 눈

        int total; //계산한 상금

        //주사위의 눈에 따라 상금 계산
        //3개의 주사위가 같은 숫자일 경우 = 10,000원+(같은 눈)×1,000
        if(A == B && A == C) {
            total = 10000 + A * 1000;
        }

        //2개의 주사위가 같은 숫자일 경우 = 1,000원+(같은 눈)×100
        else if(A == B || A == C) {
            total = 1000 + A * 100;
        }
        else if(B == C) {
            total = 1000 + B * 100;
        }

        //모두 다른 숫자일 경우 = (그 중 가장 큰 눈)×100
        else {
            total = Math.max(A, Math.max(B, C)) * 100;
        }

        //계산한 상금 출력
        System.out.println(total);
    }
}
