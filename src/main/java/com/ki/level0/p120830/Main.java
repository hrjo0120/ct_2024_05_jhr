package com.ki.level0.p120830;

public class Main {
}

// 양꼬치 10인분 먹으면 음료수 하나 서비스 10 당 음료수 -1
// 양꼬치 1인분 12,000원, 음료수 2000원
// 양꼬치 n인분과 음료수 k개 먹었을때 얼마 내야하냐 ?
class Solution {
    public int solution(int n, int k) { //양꼬치 n인분, 음료수 k개
        //int answer = 0;
        int n_sum = n * 12000;    // 양꼬치 가격
        int k_sum = k * 2000;   //음료수 가격
        int s = n / 10 * 2000;  //서비스 음료
        int answer = n_sum + k_sum - s;
        return answer;  // 총 지불액
    }
}