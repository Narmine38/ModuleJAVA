public class Exo2 {

    public static void main(String[] args) {
       System.out.println(CarreSup(63));
        System.out.println(CarreInf(63));

    }

    public static int CarreSup(Integer nbr){
        int racineCarre = (int) Math.ceil(Math.sqrt(nbr));
        return racineCarre * racineCarre;
    }

    public static int CarreInf(Integer nbr){
        int racineCarre = (int) Math.floor(Math.sqrt(nbr));
        return racineCarre * racineCarre;
    }
}
