package com.ki.level0.p120839;

public class Main {

}
// 가위 바위 보
class Solution {
    public String solution(String rsp) {
        String answer= "";
        String[] result = rsp.split("");

        for(int i = 0; i < result.length; i++) {
            if(result[i].equals("2")){
                answer += "0";
            } else if(result[i].equals("0")){
                answer += "5";
            } else if(result[i].equals("5")){
                answer += "2";
            }
        }
        return answer;
    }
}
