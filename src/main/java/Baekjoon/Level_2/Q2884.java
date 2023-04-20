//Q. 원래 설정되어 있는 알람을 언제 고쳐야 하는지 구하는 프로그램(설정해야 하는 알람 시간 = 45분 일찍)
//입력: 두 정수 H와 M(0 ≤ H ≤ 23, 0 ≤ M ≤ 59) = 설정한 놓은 알람 시간 H시 M분(24시간 표현)
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        //두 정수 H(시), M(분)에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt(); //시
        int minute = sc.nextInt();  //분

        //"M < 45"인 경우 = "H - 1" & "M + 15"
        if(minute < 45) {
                hour--;
                minute += 15;

            //"H < 0"인 경우 = "H = 23"
            if (hour < 0) hour = 23;

            //"H M"으로 출력
            System.out.println(hour + " " + minute);
        }

        //"M > 45"인 경우 = "M - 45"
        else System.out.println(hour + " " + (minute - 45));
    }
}
