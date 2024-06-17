package com.ki.level0.p120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
}

// 중앙값 구하기 - 120811
// 1. 배열 오름차순 정리하기
// 2. 중앙값 구하기

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 오름차순 정리
        int answer = array[array.length / 2]; // 중앙값 구하기
        return answer;
    }
}
