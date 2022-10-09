package az.coders.exercise;

import java.util.Scanner;

public class OctoberTask1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("a-ni daxil edin");
        Scanner scanner2=new Scanner(System.in);
        int b=scanner2.nextInt();
        System.out.println("b-ni daxil edin");
        for( int i=a; i<=b;i++){
            if(i /3==0 && i /7==0){
                System.out.println(i);

            }
        }








        
    }
}
