public class December25 {
    public static void main(String[] args) {
        int a=5;
        long result=faktorial(a);
        System.out.println(result);
    }public static long faktorial(int a){
        if(a==1) return 1;
        return faktorial( a-1)*a;
    }
}
