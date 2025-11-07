import java.util.*;
public class VendingMachine {
    static void acheterProduit(String[] produits, Double[] prix,int[] stock) {
        System.out.println("Entrez le numéro du produit :");
         Scanner scan = new Scanner(System.in);
         int num = scan.nextInt();
           if(num > produits.length || num <0 ){
               System.out.println("Produit invalid");
           }
        if (stock[num] ==0 ) {
              System.out.println("produit n'existe pas dans stock");
        }
        System.out.println("Entrez le montant inséré : ");
        double montant = scan.nextDouble();
        if (montant < prix[num]) {
            System.out.println("montant insuffisant");
        }else{
            double Monnaie = montant - prix[num];
            System.out.println("Vous avez acheté : "+produits[num]);
            System.out.println("Monnaie rendue : "+Monnaie+" MAD");
            stock[num]-- ;
        }

    }
    public static void main(String[] args) {
         String[] produits = {"Eau", "Soda", "Chips", "Chocolat"};
         Double[] prix = {5.0, 8.0, 12.0, 15.0} ;
         int[] stock = {10, 5, 7, 3} ;
        acheterProduit(produits,prix,stock);

    }
}

