//Q. 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사하는 프로그램
//입력 : 영수증에 적힌 총 금액(X), 구매한 물건의 종류의 수(N), 물건의 가격(a)와 개수(b)
//출력 : 금액이 일치하면 Yes, 일치하지 않으면 No
package main.java.Baekjoon.Level_3;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        //총 금액, 구매한 물건 종류의 수, 물건의 가격과 개수에 대한 객체 생성
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt(); //총 금액
        int N = sc.nextInt(); //구매한 물건 종류의 수

        //총 금액이 0이 될때까지 구매한 물건 가격 * 개수를 뺌
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt(); //물건 가격
            int b = sc.nextInt(); //물건 개수

            X = X - (a * b);
        }

        //만약 X = 0이라면 금액이 일치함으로 Yes 출력
        if(X == 0) System.out.println("Yes");

        //일치하지 않으면 No 출력
        else System.out.println("No");
    }
}
