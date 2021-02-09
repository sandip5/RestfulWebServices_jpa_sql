package com.general.code;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;
        List<Double> arr1 = new ArrayList<>();
        List<Double> arr2 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr1.add(sc.nextDouble());
        }
        for(int i = 0; i < m; i++) {
            arr2.add(sc.nextDouble());
        }
        Collections.sort(arr1);
        Collections.sort(arr2);

        result = (int)Math.ceil((arr1.get(arr1.size() - 1) * arr2.get(arr2.size() - 1) ) / 1000);
        System.out.println(result);


    }
}


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int h = 0;
//        int v = 0;
//        for(int i=0; i<n; i++) {
//            h = v;
//            for (int j = 0; j < n; j++) {
//                System.out.print(h + " ");
//                h = h + 4;
//            }
//            System.out.println();
//            v= v + 6;
//        }