//Q. 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램
// 입력 : 첫째 줄 = 현재 시각(A시 B분), 둘째 줄 = 요리하는데 필요한 시간(C분)
//시 = 0부터 23까지의 정수, 분 = 0부터 59까지의 정수
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        //A(현재 시각의 시), B(현재 시각의 분), C(요리에 필요한 분)에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //현재 시각 '시'
        int B = sc.nextInt(); //현재 시각 '분'
        int C = sc.nextInt(); //요리 하는데 필요한 시간 '분'

        //현재 시각(A시 B분)을 분으로 바꿈
        int min = 60 * A + B;

        //바꾼 현재 분 + 요리하는데 필요한 분을 더함
        min += C;

        //위의 값(현재 분 + 필요한 분)을 다시 (A시 B분)으로 바꿈
        //시(몫) = (위의 값(현재 분 + 필요한 분) / 60) % 24
            //시: 24이상일 경우 0부터 시작하도록 24로 나눈 나머지 연산 필요
        //분(나머지) = 위의 값(현재 분 + 필요한 분) % 60
        int hour = (min / 60) % 24;
        int minute = min % 60;

        //결과값 출력
        System.out.println(hour + " " + minute);
    }
}
