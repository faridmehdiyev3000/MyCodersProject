package az.coders.exercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ededi daxil edin");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }

        }
    }


