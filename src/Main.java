
public class Main {

    public static void main(String[] args) {
        enumerate_while(100);
        enumerate_for(100);
        enumerate_even(100);
    }

    public static void enumerate_while( Integer nbr){
        int i = 0;
        while (i <= nbr) {
            System.out.println("While" + i);
            i++;
        }
    }

    public static void enumerate_for(Integer nbr){

        for (int j = 0; j <= nbr; j++) {
            System.out.println("For" + j);
        }
    }

    public static void enumerate_even(Integer nbr){

        for (int k = 1; k <= nbr; k++) {
            if (k % 2 == 0) {
                System.out.println("nombres pairs" + k);
            }
        }
    }


}