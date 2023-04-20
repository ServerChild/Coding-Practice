//Q. 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램
//입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수(자연수는 100보다 작음)
//출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력
package main.java.Baekjoon.Level_4;

import java.io.*;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        //주어지는 자연수(배열), 최대값, 최대값 위치 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        int max = arr[0]; //최대값
        int index = 0; //최대값 위치

        //주어진 자연수에서 최대값을 찾는다(반복)
        //최대값을 찾으면서 위치도 같이 한칸씩 더함
        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if(max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
