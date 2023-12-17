

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
      

        try (Scanner input = new Scanner(System.in)) {
        	   
 double S0,ir,r;
        	do {
        		System.out.print("donner montant total");
          S0=input.nextDouble() ;
        	}while( S0<0);
        	do {
        		System.out.print("donner remborsment");
          r =input.nextDouble() ;
        	}while( r >0);
        	do {
                System.out.print("Entrez le taux d'intérêt mensuel (ir) compris entre 0 et 1 : ");
                ir = input.nextDouble();
            } while (ir <= 0 || ir >= 1);

            int mois = 0;
            double interets = 0;
            double S = S0;

            while (S > 0) {
                interets += ir * S;
                S = S - r + ir * S;
                mois++;
            }

            System.out.println("La somme des intérêts encaissés est de " + interets + " dinars.");
            System.out.println("La durée du remboursement est de " + mois + " mois.");
        }
    }







           
       
    

	






      
        	}

	        
    
    