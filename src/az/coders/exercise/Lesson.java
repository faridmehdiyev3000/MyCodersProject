package az.coders.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        int[][] a = new int[b][c];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                if (i <=j) {
                    System.out.print(a[i][j] = 1);
                } else {
                    System.out.print(a[i][j] = 0);
                }

            }System.out.println(" ");


        }
    }
}

























