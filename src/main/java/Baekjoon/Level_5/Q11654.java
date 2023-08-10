//Q. 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램
//입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나
//출력 : 입력으로 주어진 글자의 아스키 코드 값
package main.java.Baekjoon.Level_5;

public class Q11654 {
    public static void main(String[] args) throws Exception {
        //System.in : byte 값으로 문자 한개를 읽으면서 해당 문자에 대응하는 아스키 코드 값 저장
        //OException(java.io 패키지를 import 함)로 메인 옆에 써주어도 되고, 그냥 Exception 으로 처리해도 됨
        int a = System.in.read();

        System.out.println(a);
    }
}
