//Q. 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램
//입력 : 첫번째 줄에는 정수의 개수(N), 두번째 줄은 정수가 공백으로 구분, 셋째 줄에는 찾으려고 하는 정수(v)
//출력 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇개인지 출력
package main.java.Baekjoon.Level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        //정수의 개수(N), 찾으려 하는 정수 객체 생성(v)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        //주어진 정수 배열에서 찾으려는 정수가 나올때마다 갯수 + 1 반복
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //찾으려는 정수의 개수가 있을 시 + 1
        int sum = Integer.parseInt(br.readLine());
        int total = 0; //찾으려고 하는 정수의 갯수

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == sum) total++;
        }
        System.out.println(total);
        br.close();
    }
}
