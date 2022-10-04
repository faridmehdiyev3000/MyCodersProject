package az.coders.exercise;

import java.util.Scanner;

public class Palendrom {
    public static void main(String[] args){
        int r,cem=0;
        Scanner scanner5=new Scanner(System.in);
        int n=scanner5.nextInt();
        int c=n;
        while(n>0){
            r=n%10;
            cem=(cem*10)+r;
            n=n/10;
        }
        if(c==cem)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
