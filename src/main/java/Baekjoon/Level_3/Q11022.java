//Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
//입력 : 첫째 줄(테스트 케이스의 개수 T), 각 줄에는(A B)
//출력 : 각 테스트 케이스마다 "Case #x: A + B = C"형식으로 출력한 다음, A+B를 출력
package main.java.Baekjoon.Level_3;

import java.io.*;
import java.util.StringTokenizer;

public class Q11022 {
    public static void main(String[] args) throws IOException {
        //BufferedReader, Writer 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 객체 생성
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        //테스트 케이스 수만큼 A + B 연산 반복
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine() + " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
