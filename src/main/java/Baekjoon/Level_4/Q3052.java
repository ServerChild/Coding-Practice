//Q. 서로 다른 값이 몇 개 있는지 출력하는 프로그램
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구하고, 서로 다른 값 몇 개인지 구함
//입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩
//출력 : 첫째 줄에 42로 나누었을 때 서로 다른 나머지가 몇 개 있는지
package main.java.Baekjoon.Level_4;

import java.io.*;
import java.util.HashSet;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        //주어지는 숫자 배열 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //HashSet은 중복되는 원소를 넣을 경우 하나만 저장 = 중복원소를 허용하지 않음
        //순서 개념이 없음
        //나머지 값을 저장하며, 중복일 경우 저장되지 않고 HashSet에 없을 경우 저장함
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size()); //HashSet의 크기 반환(= 저장되어 있는 원소 갯수)
    }
}
