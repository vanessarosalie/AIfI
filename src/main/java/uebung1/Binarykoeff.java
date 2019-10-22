package uebung1;

public class Binarykoeff
{
    public static void main(String[] args) {
        int n = 49;
        int k = 6;

        double fakofn = 1;
        double fakofk = 1;
        double fakofnk =1;

        for (int i = 1; i < n + 1; i++)
        {
            fakofn = i * fakofn;
        }
        for (int j=1; j < k+1; j++)
        {
            fakofk = j* fakofk;
        }
        for (int m=1; m < (n-k+1) ; m++)
        {
            fakofnk = m*fakofnk;
        }

        double result = fakofn / (fakofk*fakofnk);
        System.out.println("Binärkoeff " + n+ " über "+k+" ist: "+ result);

    }
}
