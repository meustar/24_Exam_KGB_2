package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // 1번 문제.
//        System.out.println("1. 가로길이, 세로길이 입력받아 사각형 넓이만큼 별찍기.");
//
//        System.out.print("가로, 세로 길이 입력해주세요: ");
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//
//        for (int i = 1; i <= n2; i++) {
//            for (int j = 1; j <= n1; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // 2번 문제.
        System.out.print("2. 정수를 입력해주세요. : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println(" ");
        }


        // 3번 문제.
//        System.out.println("3. 정수 10개의 피보나치 수열을 출력한다.");
//
//        int num1 = 0;
//        int num2 = 1;
//        int sum = 0;
//
//        System.out.print(num1+ " ");
//        System.out.print(num2 + " ");
//        // f(n) = (n-1) +
//        for (int i = 2; i < 10; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//
//            num1 = num2;
//            num2 = sum;
//
//        }


    }
}