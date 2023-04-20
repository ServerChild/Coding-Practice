//Q. N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램
//입력 : 첫째 줄에 정수의 개수(N), 둘째 줄에는 N개의 정수를 공백으로 구분
//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수
//출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력
package main.java.Baekjoon.Level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        //정수의 개수(N) 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        //최대값과 최솟값을 찾기 위해 배열을 순차적으로 확인
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < N; i++) {
            //max와 min을 비교해서 구함
            if(min > arr[i]) min = arr[i];

            if(max < arr[i]) max = arr[i];
        }
        System.out.println(min + " " + max);
    }
}
