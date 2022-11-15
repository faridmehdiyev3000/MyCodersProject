package Novamber15;

public class ArrayForm {
    public static void main(String[] args) {
        Daire daire = new Daire();
        double s = daire.doubleSaheninTapilmasi(2, 4);
        Kvadrat kvadrat = new Kvadrat();
        double r = kvadrat.doubleSaheninTapilmasi(2, 4);
        Ucbucaq ucbucaq = new Ucbucaq();
        double g = ucbucaq.doubleSaheninTapilmasi(2, 4);
        Dordbucaq dordbucaq = new Dordbucaq();
        double l = dordbucaq.doubleSaheninTapilmasi(2, 4);
        double[] arr = {daire.doubleSaheninTapilmasi(2, 4), kvadrat.doubleSaheninTapilmasi(2, 4), ucbucaq.doubleSaheninTapilmasi(2, 4),
                dordbucaq.doubleSaheninTapilmasi(2, 4)};
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);


        }


    }
}
