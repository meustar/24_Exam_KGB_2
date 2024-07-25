package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("가로길이, 세로길이 입력받아 사각형 넓이만큼 별찍기.");
        Scanner sc = new Scanner(System.in);

        System.out.print("가로, 세로 길이 입력해주세요: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}