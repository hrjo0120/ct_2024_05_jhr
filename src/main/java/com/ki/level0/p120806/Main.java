package com.ki.level0.p120806;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int num1, int num2) {
        float result = num1 / (float)num2 * 1000;
        int answer = (int) result;
        return answer;
    }
}
