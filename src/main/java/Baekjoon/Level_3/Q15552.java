//Q. 빠른 A + B : BufferedReader와 BufferedWriter를 사용해서 각 테스트 케이스마다 A+B를 출력
package main.java.Baekjoon.Level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        //테스트 케이스 수만큼 A + B 연산 반복
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine()," ");

            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
