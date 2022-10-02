package az.coders.exercise;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println("a-ni daxil edin");
        if(a%2==0 && a>0){
            System.out.println("EDED CUTDUR VE MUSBETDIR");
        }
        else if(a%2==0 && a<0){
            System.out.println("EDED CUTDUR VE Menfidir");

        }
        else if(a%2!=0 && a<0){
            System.out.println("EDED TEKDIR VE Menfidir");

        }
        else if(a%2!=0 && a>0){
            System.out.println("EDED TEKDIR VE MUSBETDIR");
        }
        else
            System.out.println("EDED 0 dir");

    }

     void diffrentCase(){
        int a=5;
        if(a>0){
            System.out.println("A musbetdi");
        }else if (a<0){
            System.out.println("A menfidi");
        }else System.out.println("A sifirdi");


        if(a%2==0){
            System.out.println("a cut ededdi");
        }else System.out.println("A tekdi");

     }
}
