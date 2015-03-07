/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

class PileFaceStat {

  /**
   * Sequence de jeu de pile ou face
   * @param p probabilite du cote pile
   * @param n nombre de lancers
   * @return nombre de cotes pile
   */
    static int sequence(int n){
	int nb_pile=0;

	for (int k=0;k<n;k++) {
	    if (Alea.bernoulli(.5)) {
		nb_pile++;
	    }	
	}
	return nb_pile;
    }

   /**
   * Statistiques sur le jeu de pile ou face
   * @param n nombre de lancers par partie 
   * @param k nombre max de cotes pile (0<=k<=n) 
   * @param m nombre de parties
   * @return nombre de parties donnant au plus k fois le cote pile
   */
    static int stat(int n,int k,int m){
	/* On prend une pièce equilibrée */
    	int nbBonnePartie = 0 ; 
    	for(int i=1; i<=m ; i++){
    		int nbCotePile = sequence(n);
    		if(nbCotePile <= k){
    			nbBonnePartie ++;
    		}
    	}
    	return nbBonnePartie;
    }

    public static void main(String[] arg) {
	if (arg.length!=3) {
	    System.out.println("Usage : java PileFaceStat n k m");
	    System.out.println("n = nombre de lancers par partie");
	    System.out.println("k = nombre max de cotes pile");
	    System.out.println("m = nombre de parties");
	    System.out.println("Exemple : java PileFaceStat 10 2 100");
	}
	else {
	    int n=Integer.parseInt(arg[0]);
	    int k=Integer.parseInt(arg[1]);
	    int m=Integer.parseInt(arg[2]);
	    System.out.println("Fraction des "+m+" parties donnant au plus "+k+" fois le cote pile parmi "+n+" lancers :");
	    System.out.println((float) stat(n,k,m)/m);
	}
    }
}


