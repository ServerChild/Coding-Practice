//Q. 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램
//입력 : 첫째 줄(영어 소문자+대문자로만 이루어진 단어)
//출력 : 입력으로 주어진 단어의 길이
package main.java.Baekjoon.Level_5;

import java.io.*;

public class Q2743 {
    public static void main(String[] args) throws IOException {
        //입력으로 주어지는 단어 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String index = br.readLine();

        //단어 길이 출력
        System.out.println(index.length());
    }
}
