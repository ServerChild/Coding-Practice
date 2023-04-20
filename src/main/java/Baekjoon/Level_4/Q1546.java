//Q. 점수를 계산 방법에 따라 새로 계산했을 때, 새로운 평균을 구하는 프로그램
//점수 계산 방법 : 점수 중에 최댓값(M)을 고른 후, 모든 점수를 점수/M*100으로 고침
//입력 : 첫째 줄에 시험 본 과목의 개수(N), 둘째 줄에 현재 성적
//출력 : 첫째 줄에 새로운 평균, 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답
package main.java.Baekjoon.Level_4;

import java.io.*;
import java.util.*;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        //현재 점수를 담을 객체 선언
        //오차 범위가 있기 때문에 반드시 연산 할 때 자료형 1개 이상은 최소한 double형 사용
            //사용 시 자동 형변환이 되며, 큰 쪽(int에서 double)으로 변환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(br.readLine())];

        //문자열 분리를 위해 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < arr.length; i++) {
            //String 에서 double 형으로 바꾸기 위해 Double.parseDouble() 사용
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double sum = 0;
        //배열에 있는 값을 오름차순으로 정렬
        //최댓값 = 배열의 마지막 원소
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length -1]) * 100);
        }
        System.out.println(sum / arr.length);
    }
}
