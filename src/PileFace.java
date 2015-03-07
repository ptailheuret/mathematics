/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

class PileFace {

    /**
     * Sequence de jeu de pile ou face
     * @param p probabilite du cote pile
     * @param n nombre de lancers
     */
    
    static void sequence(double p,int n){
	int nb_pile=0;
	
	System.out.print("Sequence de "+n+" lancers : ");
	for (int k=0;k<n;k++) {
	    if (Alea.bernoulli(p)) {
		System.out.print("P");
		nb_pile++;
	    }
	    else
		System.out.print("F");		
	}
	System.out.println();
	System.out.println("Nombre de cotes pile : "+nb_pile);
    }
    
    public static void main(String[] arg) {
	if (arg.length!=2) {
	    System.out.println("Usage : java PileFace p n");
	    System.out.println("p = probabilite du cote pile");
	    System.out.println("n = nombre de lancers");
	    System.out.println("Exemple : java PileFace 0.5 100");
	}
	else {
	    double p=Double.parseDouble(arg[0]);
	    int n=Integer.parseInt(arg[1]);
	    sequence(p,n);
	}
    }
}


