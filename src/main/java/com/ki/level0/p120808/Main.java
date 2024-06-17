package com.ki.level0.p120808;

public class Main {
    public static void main(String[] args) {

    }
}

// 분수의 덧셈 - 120808
// 1. 분자, 분모 연산
// 2. 기약분수로 만들기
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1; // 분자
        int denom = denom1 * denom2; // 분모

        int max = 1; // 최대공약수
        for (int i = 1; i <= numer && i <= denom; i++) { // 최대공약수 구하기
            if (numer % i == 0 && denom % i == 0) { // 두 수의 공약수를 구함
                max = i; // 최대공약수 저장
            }
        }

        numer = numer / max;
        denom = denom / max;

        int[] answer = { numer, denom }; // 결과값 저장
        return answer;
    }
}
