package az.coders.exercise;

public class Farid3 {
    public static void main(String[] args) {
        suffling("codeleet",)
    }
    public static String suffling(String s, int[] indices) {
        String res = " ";

        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(indices[i]);
        }

        return res;
    }
}
