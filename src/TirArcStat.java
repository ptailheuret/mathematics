/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

class TirArcStat {

  /**
   * Fraction des tirs sur une cible de diametre 1
   * @param a distance a la cible
   * @param n nombre de tirs
   */

    static double TirReussi(double a,int n) {	
	int nbReussi = 0 ;
    for (int i = 0; i<n ; i++){
    	double tirage = Alea.cauchy(a);
		if(a<0.5 && a>(-0.5)){
			nbReussi ++;
		}
	}
	return nbReussi/n ;
    }


  /**
   * Distance moyenne des tirs au centre de la cible 
   * @param a distance a la cible
   * @param n nombre de tirs
   */

    static double DistanceMoyenne(double a,int n) {
    double somme = 0 ;
    for (int i = 0; i<n ; i++){
    	somme += Alea.cauchy(a);
    }
	return somme/((double)n);
    }


    public static void main(String[] arg) {
	if (arg.length!=2) {
	    System.out.println("Usage : java TirArcStat a n");
	    System.out.println("a = distance a la cible");
	    System.out.println("n = nombre de tirs");
	    System.out.println("Exemple : java TirArcStat 10 100");
	}
	else {
	    double a=Double.parseDouble(arg[0]);
	    int n=Integer.parseInt(arg[1]);
	    System.out.println("Fraction des "+n+" tirs sur la cible : "+(float) TirReussi(a,n));
	    System.out.println("Distance moyenne des "+n+" tirs : "+(float) DistanceMoyenne(a,n)); 
	}
    }
}

	



