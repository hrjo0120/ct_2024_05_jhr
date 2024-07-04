package com.ki.codeup;

//1021 : [기초-입출력] 단어 1개 입력받아 그대로 출력하기(설명)
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        System.out.println(a);
//    }
//}

//1022 : [기초-입출력] 문장 1개 입력받아 그대로 출력하기(설명)
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String a = scanner.nextLine();
//        System.out.println(a);
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        String[] f1 = scanner.nextLine().split(".");
        System.out.println(f1[0]);
        System.out.println(f1[1].substring(0,6));
    }
}
