package com.ki.level0.p120831;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
