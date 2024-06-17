package com.ki.level1.p12934;

public class Main {

}

// n의 제곱근 여부 판별, 제곱근일 때, x+1의 제곱 리턴, 아닐때 -1 리턴
//  Math.sqrt(25) => 5.0
// 개선시켜야함..
class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);

        if(n == x*x) {
            answer = (long) ((x+1)*(x+1));
            return answer;
        }
        return -1;
    }
}
