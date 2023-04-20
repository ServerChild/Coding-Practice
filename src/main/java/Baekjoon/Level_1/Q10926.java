//Q. 이미 존재하는 아이디 입력 시, "아이디 + ??!"를 출력하는 프로그램
package main.java.Baekjoon.Level_1;

import java.util.Scanner;

public class Q10926 {
    public static void main(String[] args) {
        //scanner 객체 생성
        //System.in: 사용자로부터 키 입력 받음
        Scanner sc = new Scanner(System.in);

        //입력받은 라인 전체를 문자열 타입으로 반환함(띄워쓰기 포함)
        String str = sc.nextLine();

        //값에 대한 결과를 "아이디 + ??!"로 출력
        System.out.println(str + "??!");
    }
}
