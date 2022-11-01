package az.coders.exercise;

public class Method {
    public static void main(String[] args) {
        double result = cem('+',4,4);
        ;
        System.out.println(result);

    }
    public static double cem(char symbol,double a,double b) {


            switch (symbol) {
                case '+':
                    return a+b;
                case '-':
                    return a-b;
                case '*':
                    return a*b;
                case '/' :
                    return a/b;
            }return -1;

    }
}

