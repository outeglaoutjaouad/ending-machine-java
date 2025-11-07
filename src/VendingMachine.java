import java.util.Scanner;


 public class VendingMachine {

     static void afficherStock(String[] produits,Double[]  prix,int[] stock) {
         System.out.println("Produits disponibles : ");
         for (int i = 0; i < produits.length; i++) {
             System.out.println(produits[i] + ". Eau (" + prix[i] + " MAD) - Stock : " + stock[i]);


         }
     }
    public static void main(String[] args) {
//        String[] produits = {"Eau", "Soda", "Chips","Chocolat"};
//        Double[]  prix = {5.0, 8.0, 12.0, 15.0};
//        int[] stock = {10, 5, 7, 3};
//        double prixProduit = prix[indexProduit];
//        int stockProduit = stock[indexProduit];


        // si on a travaillé avec arrayList
//        double prixProduit = prix.get(indexProduit);
//        int stockProduit = stock.get(indexProduit);



//        if (stockProduit > 0) {
//            Scanner scanner = new Scanner(System.in);
//            int indexProduit = scanner.nextInt();
//            System.out.print("Entrez le montant inséré : ");
//            double montantInsere = scanner.nextDouble();
//
//            if (montantInsere >= prixProduit) {
//                double monnaie = montantInsere - prixProduit;
//                stock[indexProduit] = stockProduit - 1;
//                System.out.println("Vous avez acheté : " + produits[indexProduit]);//soda
//                System.out.println("Monnaie rendue : " + monnaie + " MAD");
//            } else {
//                System.out.println("Montant insuffisant. Achat annulé.");
//            }
//        } else {
//            System.out.println("Produit en rupture de stock.");
//        }






    }
}
