package az.coders.exercise;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a-ni daxil edin");
        int a = scanner.nextInt();
        System.out.println("b-ni daxil edin");
        int b = scanner.nextInt();



        System.out.println(a*b/a);
        System.out.println(a*b/b);

        System.out.println("a= "+a);
        System.out.println("b= "+b);



        }
    }

