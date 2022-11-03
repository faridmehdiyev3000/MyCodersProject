package az.coders.exercise;

public class Farid3 {
    public static void main(String[] args) {
        String res=suffling("lessfone",new int[]{4,5,6,7,0,1,2,3});
        System.out.println(res);
    }
    public static String suffling(String s, int[] indices) {
        String res = " ";

        for (int i = 0; i < s.length(); i++) {
            res += s.charAt(indices[i]);
        }

        return res;
    }
}
