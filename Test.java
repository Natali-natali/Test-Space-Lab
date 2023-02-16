package org.example;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        chooseSort(arr);
        printArray(arr);
    }

    private static void chooseSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int nmin = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    nmin = j;
                }

            }
            if (i != nmin) {
                int t = arr[nmin];
                arr[nmin] = arr[i];
                arr[i] = t;
            }
        }
    }
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
