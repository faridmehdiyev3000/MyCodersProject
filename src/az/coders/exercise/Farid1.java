package az.coders.exercise;

import java.util.Random;

public class Farid1 {
    public static void main(String[] args) {
        int cem = 0;
        Random a = new Random();
        int i = a.nextInt(1, 9);
        int f = a.nextInt(1, 9);
        int y = a.nextInt(1, 9);
        int[] t = {i, f, y};
        System.out.print(i);
        System.out.print(f);
        System.out.print(y);
        System.out.print(" ");
        cem += 100 * i + 10 * f + y + 1;
        System.out.println(cem);
        int[] l = {i, f, y + 1};
        int p;
        for (p = 0; p < l.length; p++) {
            System.out.print(l[p]);
            System.out.print(" ,");

        }
    }
}

