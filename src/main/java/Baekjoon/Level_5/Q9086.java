//Q. 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램
//입력 : 첫 줄(테스트 케이스의 개수, T), 각 테스트 케이스는 한 줄에 하나의 문자열이 주어짐
//출력 : 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자 연속
package main.java.Baekjoon.Level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
    public static void main(String[] args) throws IOException {
        //테스트 케이스의 개수(T)에 대한 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        //테스트 케이스의 문자열의 첫 글자, 마지막 글자 찾음(반복)
        for(int i = 0; i < T; i++) {
            String s = br.readLine();

            //첫 번째 문자 + 마지막 문자를 붙임
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()- 1) + "\n");
        }
        System.out.println(sb);
    }
}
