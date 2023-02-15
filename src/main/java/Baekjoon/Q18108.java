package main.java.Baekjoon;

import java.util.Scanner;

public class Q18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //불기 연도를 입력 받는다
        int year = sc.nextInt();

        //불기 연도를 서기 연도로 변환해서 출력
        //불기 연도를 서기 연도로 변환할 때 : 불기 - 543 = 서기
        System.out.println(year - 543);
    }
}
