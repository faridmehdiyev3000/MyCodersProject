package az.coders.exercise;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        if (b - c == 1 || c - b == 1) {
            System.out.println("30 derece");

        } else if (b - c == 2 || c - b == 2) {
            System.out.println("60 derece");

        } else if (b - c == 3 || c - b == 3) {
            System.out.println("90 derece");

        } else if (b - c == 4 || c - b == 4) {
            System.out.println("120 derece");
        } else if (b - c == 5 || c - b == 5) {
            System.out.println("150 derece");
        } else if (b - c == 6 || c - b == 6) {
            System.out.println("180 derece");
        } else if (b - c == 7 || c - b == 7) {
            System.out.println("210 derece");
        } else if (b - c == 8 || c - b == 8) {
            System.out.println("240 derece");
        } else if (b - c == 9 || c - b == 9) {
            System.out.println("270 derece");
        } else if (b - c == 10 || c - b == 10) {
            System.out.println("300 derece");
        } else if (b - c == 11 || c - b == 11) {
            System.out.println("330 derece");
        } else if (b - c == 0 || c - b == 0) {
            System.out.println("0 derece");
        }
        }
    }




