package az.coders.exercise;

public class Farid2 {
    public static void main(String[] args) {
        int cem = 0;
        StringBuilder sb2 = new StringBuilder("animaalll");
        for (int i = 0; i < sb2.length(); i++) {
            for (int j = 0; i < sb2.length(); j++) {
                if (sb2.charAt(i) == sb2.charAt(j)) {
                    cem += 1;
                    System.out.println(cem);
                    System.out.println(sb2.charAt(i));




                }
            }
        }
    }
}
