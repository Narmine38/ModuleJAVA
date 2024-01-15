import java.util.ArrayList;

public class Exo4 {


    public static void main(String[] args){

        describe();
        to_upper_case();

    }

    public static void describe() {
        ArrayList<String> prenom = new ArrayList<String>();
        prenom.add("cedric");
        prenom.add("charly");
        prenom.add("nicolas");
        prenom.add("jean");

        for (String i : prenom) {
            if (i.length() > 4) {
                System.out.println(i + " " + i.length());
            }
        }
    }

    public static void to_upper_case(){

        ArrayList<String> prenom = new ArrayList<String>();
        prenom.add("cedric");
        prenom.add("charly");
        prenom.add("nicolas");
        prenom.add("jean");

        for (String i : prenom){
            System.out.println(i.toUpperCase() + " " + i.length());

        }

    }



}
