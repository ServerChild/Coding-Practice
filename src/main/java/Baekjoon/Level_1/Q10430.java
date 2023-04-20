//Q. 세 수가 주어졌을 때, "(A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C" 출력하는 프로그램(+ 첫째 줄에 세 수가 순서대로 입력됨)
package main.java.Baekjoon.Level_1;

import java.util.Scanner;

public class Q10430 {
    public static void main(String[] args) {
        //scanner 객체 생성
        //System.in: 사용자로부터 키 입력 받음
        Scanner sc = new Scanner(System.in);

        //세 수 A,B,C를 입력받음
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        //"(A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C"에 대한 값 출력
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
