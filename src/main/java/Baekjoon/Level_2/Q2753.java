//Q. 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        //연도 입력받을 객체 생성
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        //4의 배수(o), 100의 배수(x), 400의 배수(o) = 윤년
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
