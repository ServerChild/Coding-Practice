//Q. 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램
//입력 : 첫째 줄에 N(수열을 이루는 정수 개수)과 X(구하려는 값 기준), 둘째 줄에 A(수열)와 N(수열을 이루는 정수 개수)
//출력 : X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력
package main.java.Baekjoon.Level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        //N(수열을 이루는 정수 개수), X(구하려는 값 기준), A(수열) 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        //수열(A)에서 X(기준)보다 작은 수 구하기 반복
        for(int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if(value < X) sb.append(value).append(' ');
        }
        System.out.println(sb);
    }
}
