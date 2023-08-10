//Q. 알파벳 소문자로만 이루어진 단어 S가 주어짐. 각 알파벳에 대해서, 단어에 포함된 경우 처음 등장하는 위치, 포함되어 있지 않은 경우 -1을 출력하는 프로그램
//입력 : 단어 S(첫째 줄) -> 단어 길이는 100이 넘지 않으며, 알파벳 소문자만
//출력 : 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력
//      포함되어 있지 않다면 -1 출력, 첫번째 글자 = 0번째 위치 / 두번째 글자 = 1번째 위치
package main.java.Baekjoon.Level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        //단어 S, 알파벳 배열 객체 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        //배열 arr의 값을 모두 -1로 초기화
        //문자열 S의 문자 위치를 가리킬 배열 = index 위치
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String S = br.readLine();

        //문자열의 각 문자 확인(반복)
        //문자의 위치를 arr 배열의 값으로 바꿈
        //arr 배열 인덱스 = ch가 갖고 있는 문자 인코딩 값(= 아스키코드 값과 동일)에 'a' 또는 97을 뺌
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            //동일 문자가 포함되어 있는 경우 처음 나타낸 위치로 변경 = arr의 값을 변경하지 않음
            //-1인 경우에는 배열의 원소 값 변경, 아닌 경우 변경x
            //arr 원소 값이 -1인 경우에만 초기화
            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        //배열 출력
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
