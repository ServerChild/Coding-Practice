//Q. 두 자연수를 입력받은 후, "A+B, A-B, A*B, A/B(몫), A%B(나머지)"를 출력하는 프로그램
package main.java.Baekjoon.Level_1;

import java.util.Scanner;

public class Q10869 {
    public static void main(String[] args) {
        //scanner 객체 생성
        //System.in: 사용자로부터 키 입력 받음
        Scanner sc = new Scanner(System.in);

        //입력받은 값을 int형으로 반환함
        int A = sc.nextInt();
        int B = sc.nextInt();

        //"A+B, A-B, A*B, A/B(몫), A%B(나머지)"한 값을 출력
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
