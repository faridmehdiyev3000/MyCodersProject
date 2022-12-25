package az.coders.exercise;

import java.util.Scanner;

public class MapString {
    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        int  count=0;
        for (int i =0;i<s.length();i++) {

            for (int j =i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    count+=1;

                }  System.out.println(count);      

            }

        }


    }

}
