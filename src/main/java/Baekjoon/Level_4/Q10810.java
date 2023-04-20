//Q. 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램
//가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있음
//바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣음
//공을 넣을 바구니는 연속되어 있어야 함
//입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100), 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법
//공을 넣는 방법 : i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣음
package main.java.Baekjoon.Level_4;

import java.io.*;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        //공이 넣어졌을 경우(배열), 가지고 있는 바구니 총 갯수(N), 앞으로 넣을 공번(M) 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            //시작 바구니(I), 마지막 바구니(J), 공 번호(K)에 대한 객체 생성
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
