//Q. 원래 설정되어 있는 알람을 언제 고쳐야 하는지 구하는 프로그램(설정해야 하는 알람 시간 = 45분 일찍)
//입력: 두 정수 H와 M(0 ≤ H ≤ 23, 0 ≤ M ≤ 59) = 설정한 놓은 알람 시간 H시 M분(24시간 표현)
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 시(H), 분(M) 객체 선언
        int H = sc.nextInt();
        int M = sc.nextInt();

        // 분(M)이 45보다 작을 경우 -> 시(H) -1, 분(M) + 15
        if(M < 45) {
            H--;
            M += 15;

            // 시(H)가 0보다 작을 경우 -> 시(H) = 23
            if (H < 0) H = 23;

            System.out.println(H + " " + M);
        }
        // 분(M)이 45보다 클 경우 -> 시(H)는 그대로, 분(M) - 45
        else {
            System.out.println(H + " " + (M - 45));
        }
    }
}
