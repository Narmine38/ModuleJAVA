import java.util.ArrayList;

public class Exo3 {

    public static void main(String[] args) {
        fibo();
        //playFiboRecurcive();
       //approximation_fibo();

        System.out.println(getApproxiamationFibo(0.01F));
    }

    public static void fibo() {
        int nbr1 = 0;
        int nbr2 = 1;
        int nbr3;
        int i;
        int count = 10;

        System.out.print(nbr1 + " " + nbr2);

        for (i = 2; i < count; ++i) {
            nbr3 = nbr1 + nbr2;
            nbr1 = nbr2;
            nbr2 = nbr3;
            System.out.print(" " + nbr3);
        }
    }

    public static Integer fibRecursive(Integer nbr) {
        if (nbr <= 1) {
            return nbr;
        }

        return fibRecursive(nbr - 1) + fibRecursive(nbr - 2);
    }

    public static void playFiboRecurcive() {
        int nbr = 10;
        for (int i = 0; i < nbr; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
    }


    public static void approximation_fibo(Float nbr) {
        Float epsilon = 0.01F;
        float phi = (float) (1 + Math.sqrt(5)) / 2;


    }

    public static ArrayList<Integer> getApproxiamationFibo(float epsilon) {

        float phi = (float) (1 + Math.sqrt(5)) / 2;

        ArrayList<Integer> fibonacciArrayList = new ArrayList<>();

        ArrayList<Integer> fiboNumber = new ArrayList<>();

        fibonacciArrayList.add(0);
        fibonacciArrayList.add(1);


        int i = 2;

        do {
            fibonacciArrayList.add(i, fibonacciArrayList.get(i - 2) + fibonacciArrayList.get(i - 1));

            if (Math.abs(((float) fibonacciArrayList.get(i - 1) / fibonacciArrayList.get(i - 2)) - phi) <= epsilon) {
                fiboNumber.add(fibonacciArrayList.get(i - 1));
                fiboNumber.add(fibonacciArrayList.get(i - 2));
                return fiboNumber;
            }

            i++;

        } while (fiboNumber.isEmpty());
        return fiboNumber;
    }





}
