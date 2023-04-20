//Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
//입력 : 첫째 줄에 테스트 케이스의 개수 T(테스트 케이스는 한 줄), 각 줄에 A와 B가 주어짐
//출력 : 각 테스트 케이스마다 A+B를 출력
package main.java.Baekjoon.Level_3;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        //테스트 케이스 T와 A,B 객체 생성
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        //테스트 케이스 수만큼 A + B 연산 반복
        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
