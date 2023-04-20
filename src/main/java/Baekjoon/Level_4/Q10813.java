//Q. 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램
//바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있음
//공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환
//입력 : 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100), 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법
//공 교환할 방법 : i번 바구니와 j번 바구니에 들어있는 공을 교환
package main.java.Baekjoon.Level_4;

import java.io.*;
import java.util.StringTokenizer;

public class Q10813 {
    public static void main(String[] args) throws IOException {
        //공이 넣어졌을 경우(배열), 총 바구니 갯수(N), 앞으로 넣을 공번(M) 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];

        int I, J, tmp;

        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            //시작 바구니(I), 마지막 바구니(J)에 대한 객체 생성
            I = Integer.parseInt(st.nextToken());
            J = Integer.parseInt(st.nextToken());

            //공 바꿔주는 중간 역할
            tmp = arr[I];
            arr[I] = arr[J];
            arr[J] = tmp;
        }

        for(int i = 1; i <= N; i++) {
            bw.write(arr[i] + " ");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
