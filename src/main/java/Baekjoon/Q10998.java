//Q. 두 정수를 입력받은 다음, A*B를 출력하는 프로그램
package main.java.Baekjoon;

import java.util.Scanner;

public class Q10998 {
    public static void main(String[] args) {
        //scanner 객체 생성
        //System.in: 사용자로부터 키 입력 받음
        Scanner sc = new Scanner(System.in);

        //입력받은 값을 int형으로 반환함
        int A = sc.nextInt();
        int B = sc.nextInt();

        //A*B한 값을 출력
        System.out.println(A * B);
    }
}
