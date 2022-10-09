package az.coders.exercise;

import java.util.Scanner;

public class OctoberTask1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("a-ni daxil edin");
        int a=scanner.nextInt();

        System.out.println("b-ni daxil edin");
        int b=scanner.nextInt();

        for( int i=a; i<=b;i++){
            if(i %3==0 && i %7==0){
                System.out.println(i);

            }
        }








        
    }
}
