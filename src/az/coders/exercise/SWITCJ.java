package az.coders.exercise;

import java.util.Scanner;

public class SWITCJ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        Scanner scanner2=new Scanner(System.in);
        int b=scanner2.nextInt();
        System.out.println("emeliyyat faxil edin (+(1),-(2),*(3),/(4)");
        Scanner scanner3=new Scanner(System.in);
        int operation=scanner3.nextInt();
        switch(operation) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a + b);
                break;

            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);

        }
    }

}
