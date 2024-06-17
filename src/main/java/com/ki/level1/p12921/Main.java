package com.ki.level1.p12921;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n) {

        int rscount = 0;

        for (int i = 1; i <= n; i++) {  //1부터 n까지 소수의 개수 카운트 반복.
            if(isPrimeNumber(i)) {
                rscount++;
            }

        }
        return rscount;
    }

    public boolean isPrimeNumber(int n) {   //소수 찾기
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
