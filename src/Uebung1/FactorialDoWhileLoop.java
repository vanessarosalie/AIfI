package Uebung1;

public class FactorialDoWhileLoop {

    public static void main(String[] args) {

        int number = 5;
        int fak = 1;
        int i = 1;

        do {

            fak *= i;
            i = i + 1;

        } while (i <= number);

        System.out.println(fak);

    }
}
