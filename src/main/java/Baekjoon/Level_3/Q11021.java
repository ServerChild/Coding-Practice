//Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
//입력 : 첫째 줄(테스트 케이스의 개수 T), 각 줄에는(A B)
//출력 : 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력
package main.java.Baekjoon.Level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        //BufferedReader, Writer 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 개수 T 객체 생성
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        //테스트 케이스 수만큼 A + B 연산 반복
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," ");

            bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
