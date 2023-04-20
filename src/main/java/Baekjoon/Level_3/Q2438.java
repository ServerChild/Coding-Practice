//Q. 첫째 줄부터 N번째 줄까지 차례대로 별을 출력하는 프로그램
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍음
package main.java.Baekjoon.Level_3;

import java.io.*;

public class Q2438 {
    public static void main(String[] args) throws IOException {
        //줄 개수(N)에 대한 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //i(행) : i의 값만큼 반복해서 출력
        //j : i의 값만큼 반복
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
