package Uebung1;

public class InverseFactorial {

    public static void main(String[] args) {

        long fac = 1 ;
//        int i = 1 ;

//        while (fac <= 1000000000) {
//            i = i + 1 ;
//            fac = fac * i ;
//        }

        for (int i = 0; i <= 1000; i++) {
            fac = fac * i;

            if (fac > 1000000) {
                break ;
            }
        }

//        System.out.println("i = " + i );

    }
}
