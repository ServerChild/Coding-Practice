//Q. 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램
//단, x좌표와 y좌표는 모두 양수나 음수라고 가정

package main.java.Baekjoon.Level_2;

import java.util.Scanner;

public class Q14681 {
    public static void main(String[] args) {
        //좌표 x, y 객체 생성
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        //x, y 둘다 양수일 경우 = 1사분면
        if(x > 0 && y > 0) System.out.println(1);
        //x가 음수, y가 양수일 경우 = 2사분면
        else if(x < 0 && y > 0) System.out.println(2);
        //x가 음수, y가 음수일 경우 = 3사분면
        else if(x < 0 && y < 0) System.out.println(3);
        //x가 양수, y가 음수일 경우 = 4사분면
        else if(x > 0 && y < 0) System.out.println(4);
    }
}
