//Q. N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하는 프로그램
//입력: 문제의 정수 N이 주어짐(4 <= N <= 1000, 4의 배수)
//출력: N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형 이름 출력
package main.java.Baekjoon.Level_3;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        //N바이트에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = "";

        //4로 나눠준 수만큼 long 반복 입력
        for(int i = 1; i <= N/4; i++) {
            str += "long ";
        }

        System.out.println(str + "int");
    }
}
