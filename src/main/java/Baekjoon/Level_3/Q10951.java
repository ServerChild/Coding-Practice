//Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램(EOF)
//EOF : 입력에서 더이상의 읽을 수 있는 데이터가 존재하지 않을 때 반복문 종료
package main.java.Baekjoon.Level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append('\n');
        }
        System.out.println(sb);
    }
}
