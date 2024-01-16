import java.util.ArrayList;

public class Exo3 {

    public static void main(String[] args) {

        //System.out.println(fibo(10));
        //System.out.println(playFiboRecurcive());
        //System.out.println(getApproxiamationFibo(0.01F));
        System.out.println(getApproxiamationFibo(0.01));
    }

    public static ArrayList<String> fibo(Integer count) {
        int nbr1 = 0;
        int nbr2 = 1;
        int nbr3;
        int i;

        ArrayList<String> fiboListe = new ArrayList<String>();

        for (i = 2; i < count; ++i) {
            nbr3 = nbr1 + nbr2;
            nbr1 = nbr2;
            nbr2 = nbr3;
            fiboListe.add(String.valueOf(" " + nbr3));
        }
        return fiboListe;
    }


    public static Integer fibRecursive(Integer nbr) {
        if (nbr <= 1) {
            return nbr;
        }

        return fibRecursive(nbr - 1) + fibRecursive(nbr - 2);
    }

    public static ArrayList<String> playFiboRecurcive() {

        ArrayList<String> fiboList = new ArrayList<String>();

        int nbr = 10;
        for (int i = 0; i < nbr; i++) {

            fiboList.add(fibRecursive(i) + " ");
        }
        return fiboList;
    }


    public static ArrayList<Integer> getApproxiamationFibo(Double epsilon) {
        float phi = (float) (1 + Math.sqrt(5)) / 2;

        ArrayList<Integer> fibonacciArrayList = new ArrayList<>();
        ArrayList<Integer> fiboNumber = new ArrayList<>();

        fibonacciArrayList.add(0);
        fibonacciArrayList.add(1);

        int i = 2;

        while (Math.abs(((float) fibonacciArrayList.get(i - 1) / fibonacciArrayList.get(i - 2)) - phi) > epsilon){
            fibonacciArrayList.add(i, fibonacciArrayList.get(i - 2) + fibonacciArrayList.get(i - 1));
            i++;
        }

        fiboNumber.add(fibonacciArrayList.get(i - 1));
        fiboNumber.add(fibonacciArrayList.get(i - 2));
        return fiboNumber;
    }


}
