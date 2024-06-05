package com.ki.level0.p120817;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public double solution(int[] numbers) {
//        1. 배열 내의 원소 값들을 모두 더함, 배열[0] 부터 [n] 더할것
//        2. 더한뒤 배열의 길이 수로 나눈다.
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double answer = sum / numbers.length;
        return answer;  //평균값 리턴.
    }
}
