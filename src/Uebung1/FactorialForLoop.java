package Uebung1;

public class FactorialForLoop {
    public static void main(String[] args) {

        int number = 5 ;
        int fak = 1 ;

        for (int i = 1; i <= number; i++) {

            fak *= i;

        }

        System.out.println(fak);

    }

}
