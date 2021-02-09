package com.general.code;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int result = 0;

    public static void main(String[] args) {
        Main main = new Main();
        int N = sc.nextInt();
        int[] elements = new int[N];
        int[] waysOfElements = new int[N];
        for (int i = 0; i < N; i++) {
            elements[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            result = 0;
            waysOfElements[i] = main.ways(elements[i], elements[i], 0);
        }
        for(int itr : waysOfElements) {
            System.out.println(itr);
        }
    }

    int ways(int number, int a, int init){
        if (a == 0) {
            result++;
        }
        int max = number;
        for (int i = init + 1; i <= max; i++) {
            int b = a - i;
            if (b >= 0)
                ways(number, a - i, i);
        }
        return result;
    }
}

