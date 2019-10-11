package Uebung1;

public class FactorialWhileLoop {

    public static void main(String[] args) {

        int number = 5 ;
        int fak = 1 ;
        int i = 1 ;

        while ( i <= number) {

            fak *= i ;
            i = i + 1 ;

        }

        System.out.println(fak);
    }
}
