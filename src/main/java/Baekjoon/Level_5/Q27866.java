//Q. 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램
//입력 : 첫째 줄(영어 소문자+대문자로 이루어진 단어 S), 둘째 줄(정수 i)
//출력 : S의 i번째 글자
package main.java.Baekjoon.Level_5;

import java.io.*;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        // 단어 S와 몇번째 i에 대한 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        //substring을 통한 값 출력
        //i-1(시작 위치) : 입력받은 i값에서 1을 뺀 값(인덱스가 0부터 시작하기 때문에)
        //i(끝 위치) : 입력받은 값 그 자체(끝 위치 전까지 출력이므로 입력받은 값 그대로)
        bw.write(S.substring(i-1, i));
        bw.close();
    }
}
