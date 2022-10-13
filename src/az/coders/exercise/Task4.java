package az.coders.exercise;

public class Task4 {
    public static void main(String[] args) {
        int[] a = {1, 6, 4, 3, 7};
        for (int i = 0; i < a.length;i++){
            for (int j = i+1; j < a.length;j++){
                int temp=0;
                if (a[i] < a[j]) {
                    // Swapping
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }System.out.println(a[i]);
        }
    }
}

