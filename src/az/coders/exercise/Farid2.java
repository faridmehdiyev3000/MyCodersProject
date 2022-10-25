package az.coders.exercise;

public class Farid2 {
    public static void main(String[] args) {
        int cem = 1;
        StringBuilder sb2 = new StringBuilder("animal");
        for (int i = 0; i < sb2.length(); i++) {
            for (int j = 1; i < sb2.length(); j++) {
                if (sb2.charAt(i) == sb2.charAt(j)) {
                    cem += 1;
                    System.out.println(cem);


                }
            }
        }
    }
}
