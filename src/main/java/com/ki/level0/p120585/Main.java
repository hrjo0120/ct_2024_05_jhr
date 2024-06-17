package com.ki.level0.p120585;

public class Main {
    public static void main(String[] args) {

    }
}

// 머쓱이보다 키 큰 사람 - 120585
// 1. 머쓱이의 키와 배열에 있는 값을 비교해서 머쓱이보다 키가 클 때 카운트 1
class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++;
            }
        }

        return count;
    }
}
