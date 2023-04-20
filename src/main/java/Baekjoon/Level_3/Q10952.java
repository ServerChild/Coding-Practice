//Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
//입력 : 여러 개의 테스트 케이스(각 줄에 A B), 마지막에는 0 두개
//출력 : 각 테스트 케이스마다 A + B 출력
package main.java.Baekjoon.Level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        //객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //A와 B가 0 0 이 될때까지 반복
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0) break;

            sb.append((A+B)).append('\n');
        }
        System.out.println(sb);
    }
}
