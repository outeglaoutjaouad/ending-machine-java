import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VendingMachine {
    static void afficherProduits(String[] produits, Double[] prix, int[] stock) {
          System.out.println("Produits disponibles : ");
          for (int i=0; i<produits.length;i++){
              System.out.println(produits[i]+". Eau ("+prix[i] +" MAD) - Stock : "+stock[i] );
          }

        }


    public static void main (String[] args){
        String[] produits = {"Eau", "Soda", "Chips", "Chocolat"};
        Double[] prix = {5.0, 8.0, 12.0, 15.0};
        int[] stock = {10, 5, 7, 3};
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        System.out.println("=== Bienvenue au distributeur automatique ===");


        while (continuer) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Afficher les produits");
            System.out.println("2. Acheter un produit");
            System.out.println("3. Afficher update-stock ");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    afficherProduits(produits, prix, stock);
                    break;

                case 2:
                  //  acheterProduit(produits,prix,stock);
                    break;

                case 3:
                    //acheterProduit(produits,prix,stock);
                    //afficherStock(produits,prix,stock);
                    break;


                case 4:
                    System.out.println("Merci de votre visite !");
                    continuer = false;
                    break;

                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }


}
}