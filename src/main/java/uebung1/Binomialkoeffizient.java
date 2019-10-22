package uebung1;
// von Stefan Schulz
public class Binomialkoeffizient {


    public static int diff(int a, int b){ //berechnet Differenz a-b
        int erg= 0;
        erg= a-b;
        return erg;
    }
    public static double faku(int zahl){ //berechnet Fakultät eines Integer
        double erg=1.0;
        for(int i=1; i<=zahl; i++)
        {
            erg = erg*i;
        }
        return erg;
    }

    public static void main(String[] args){
        int n=49;
        int k=6;
        double enderg=0;
        enderg= faku(n)/(faku(k)*faku(diff(n, k)));
        System.out.println(n+" über "+k+" entspricht "+enderg);

    }
}
