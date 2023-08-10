//Q. N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램
//입력 : 첫째 줄(숫자의 개수 N), 둘째 줄(숫자 N개가 공백없이 주어짐)
//출력 : 입력으로 주어진 숫자 N개의 합
package main.java.Baekjoon.Level_5;

import java.io.*;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        //입력받을 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine(); //N은 필요 없으니 입력만 받음

        int sum = 0;

        //getBytes() : readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환
        for(byte value : br.readLine().getBytes()) {
            sum += (value - '0'); //문자 값을 저장해야 함으로 -'0'
        }

        System.out.println(sum);
    }
}
