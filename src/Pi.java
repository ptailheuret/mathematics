/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

class Pi {

    /**
     * Estimation du nombre pi
     * @param n nombre de points 
     * @return valeur estimee de pi
     */
    
    static double EstimationPi(int n){
    	int nbBon = 0;
    	for (int i = 0; i<n ; i++){
    		double x = Alea.uniform();
    		double y = Alea.uniform();
    		if(x*x + y*y <1){
    			nbBon ++;
    		}
    	}
    	return (double) 4*nbBon/((double)n);
    }
    
    static double EstimationEcartType(int n, int m){
    	double[] tab = new double[m];
    	double somme = 0 ;
    	double sommeCarre = 0 ;
    	for(int i = 0; i<m ; i++){
    		tab[i] = EstimationPi(n);
    		double temporaire = tab[i];
    		somme += temporaire ;
    		sommeCarre += temporaire*temporaire;
    	}
    	double moyenneAuCarre = somme*somme/((double)(m*m)) ;
    	double moyenneDesCarres = 1/((double)m)*sommeCarre ;
    	return Math.sqrt(moyenneDesCarres - moyenneAuCarre) ;
    }

    public static void main(String[] arg) {
	if (arg.length!=1 && arg.length!=2) {
		System.out.println("arg.length = "+ arg.length);
	    System.out.println("Usage : java Pi n");
	    System.out.println("n = nombre de points");
	    System.out.println("Exemple : java Pi 100");
	    System.out.println("OU Usage : java Pi n m");
	    System.out.println("n = nombre de points par tirages");
	    System.out.println("m = nombre de tirages à effectuer");
	    System.out.println("Exemple : java Pi 100 100");
	}
	else {
		if(arg.length == 1){
			int n=Integer.parseInt(arg[0]);
			System.out.println("Estimation du nombre pi sur la base de "+n+" points :");
			System.out.println(EstimationPi(n));
		}
		else{
			int n = Integer.parseInt(arg[0]);
			int m = Integer.parseInt(arg[1]);
			System.out.println("Estimation de l'écart-type pour "+m+" tirages effectués, avec "+n+" points par tirages" );
			System.out.println(EstimationEcartType(n, m));
		}
	}
    }
}


