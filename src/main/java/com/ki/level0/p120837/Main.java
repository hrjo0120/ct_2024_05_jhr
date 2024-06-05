package com.ki.level0.p120837;

public class Main {
}
// 장군개미: 5, 병정개미: 3, 일개미: 1

class Solution {
    public int solution(int hp) {
        int a_hp = 5, b_hp = 3, c_hp = 1;
        int a_ant = hp/a_hp;
        int b_ant = (hp%a_hp)/b_hp;
        int c_ant = ((hp%a_hp)%b_hp)/c_hp;
        int answer = a_ant + b_ant + c_ant;
        return answer;  // 몇마리의 개미가 필요한가. 최소한의 마리수로 결정,
    }
}
