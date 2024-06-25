package com.ki.level0.p120851;

public class Main {
}
// 숨어있는 숫자의 덧셈
class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("");
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
           answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }
}