//Q. 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램
//바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음 왼쪽 바구니부터 출력
//입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100), 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법
//바구니의 순서를 역순으로 만드는 방법 : 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다
package main.java.Baekjoon.Level_4;

import java.io.*;
import java.util.StringTokenizer;

public class Q10811 {
    public static void main(String[] args) throws IOException {
        //가지고 있는 바구니 총 개수(N), 바꿀 바구니 순서(M) 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        int i, j, tmp = 0;

        for(int s = 1; s <= N; s++) {
            arr[s] = s;
        }

        for(int s = 0; s < M; s++) {
            st = new StringTokenizer(br.readLine(), " ");

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());

            for(int ss = i; ss <= (j - i) / 2 + i; ss++) {
                tmp = arr[ss];
                arr[ss] = arr[j - ss + i];
                arr[j - ss + i] = tmp;
            }
        }

        for(int s = 1; s <= N; s++) {
            bw.write(arr[s] + " ");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
