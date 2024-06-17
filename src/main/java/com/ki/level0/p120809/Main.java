package com.ki.level0.p120809;

public class Main {
    public static void main(String[] args) {

    }
}

// 배열 두배 만들기 - 120809
// 1. 배열의 길이만큼 두배 만들기
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // 객체 생성, 공간은 배열의 길이 만큼

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;

    }
}
