//Q. 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램
//X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데, 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호 있음
//입력 : 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어잠(출석번호 중복x)
//출력 : 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것, 2번째 줄에는 그 다음 출석번호
package main.java.Baekjoon.Level_4;

import java.io.*;

public class Q5597 {
    public static void main(String[] args) throws IOException {
        //출석번호가 나열될 배열 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[31];

        //제출한 학생 = true(배열을 순회하며 확인, 반복)
        for(int i = 0; i < 28; i++) {
            //출석번호(n) 객체 생성
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }
        //제출 안 한 학생 = false(배열을 순회하며 확인, 반복)
        for(int i = 1; i <= 30; i++) {
            if(!arr[i]) System.out.println(i);
        }
    }
}
