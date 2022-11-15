package Novamber15;

public class ArrayForm {
    public static void main(String[] args) {
        Daire daire = new Daire();

        Kvadrat kvadrat = new Kvadrat();

        Ucbucaq ucbucaq = new Ucbucaq();

        Dordbucaq dordbucaq = new Dordbucaq();

        double[] arr = {daire.doubleSaheninTapilmasi(2, 4), kvadrat.doubleSaheninTapilmasi(2, 4), ucbucaq.doubleSaheninTapilmasi(2, 4),
                dordbucaq.doubleSaheninTapilmasi(2, 4)};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);


        }


    }
}
