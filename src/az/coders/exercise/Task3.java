package az.coders.exercise;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a[] = {3, 7, 9, 12, 18, 34};

        int b = new Scanner(System.in).nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println(i);
                break;
            }else if (a[i] != b) {
                if ((a[i] <= b) && (b <= a[i + 1])){
                    System.out.println(i+1);
                    break;


            }

            }
            }
        }
}



