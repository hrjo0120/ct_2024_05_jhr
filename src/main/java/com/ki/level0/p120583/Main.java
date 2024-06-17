package com.ki.level0.p120583;

public class Main {
    public static void main(String[] args) {

    }
}

// 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
// array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
// 1. 배열의 값을 불러옴.
// 2. 배열에 있는 값과, 정수 n을 비교

// 중복된 숫자 개수 - 120583
// 1. 정수 n과 배열에 있는 값을 비교하면서 똑같은 값이 있을 경우 카운트 1 증가
class Solution {
    public int solution(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        return count;
    }
}
