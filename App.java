import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int choix = 1;

        Anglais vAnglais = new Anglais();
        vAnglais.addDico("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDico("Bonjour", "Demat");


        do  {
            System.out.println("Choisir votre langue pour dire bonjour ");
            System.out.println("1 : Anglais");
            System.out.println("2 : Breton");

            choix = scan.nextInt();
            if(choix == 1){
                System.out.println(vAnglais.getTraduction("Bonjour"));
            }else if (choix == 2){
                System.out.println(vBreton.getTraduction("Bonjour"));
            }
            else {
                System.out.println((choix + " n'est pas une entrée valable"));
            }
        }
        while (choix != 1 && choix != 2);

        //Fenetre f = new Fenetre();
        //f.setVisible(true);
    }
}