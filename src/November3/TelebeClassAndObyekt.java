package November3;

import java.util.Scanner;

public class TelebeClassAndObyekt {
    public static void main(String[] args) {
        Telebe telebe1=new Telebe();
        telebe1.name="Farid";
        telebe1.age=18;
        telebe1.surname="ajajaja";
        Telebe telebe2=new Telebe();
        telebe2.name="Resad";
        telebe2.age=23;
        telebe2.surname="ssjsjsj";
        Telebe telebe3=new Telebe();
        telebe3.name="Sahil";
        telebe3.age=19;
        telebe3.surname="fasjssks";
        String[]nameArray={telebe1.name,telebe2.name, telebe3.name};
        String[]surnameArray={telebe1.surname,telebe2.surname, telebe3.surname};
        int[]age={telebe1.age,telebe3.age, telebe2.age};
        for (int i=0;i< age.length;i++){
            System.out.print(age[i]);
            System.out.println(" ");
        }


        }

        }





