//Q. 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        //시험 점수 객체 생성
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        //A = 90 ~ 100
        if(score >= 90) System.out.println("A");
        //B = 80 ~ 89
        else if(score >= 80) System.out.println("B");
        //C = 70 ~ 79
        else if(score >= 70) System.out.println("C");
        //D = 60 ~ 69
        else if(score >= 60) System.out.println("D");
        //F = 나머지 점수
        else System.out.println("F");
    }
}
