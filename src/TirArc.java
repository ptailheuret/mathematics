/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

class TirArc {
    
    /**
     * Sequence de tir a l'arc 
     * @param a distance a la cible
     * @param n nombre de tirs
     */
    
    static void sequence(double a,int n){
	System.out.print("Sequence de "+n+" tirs a distance "+a+" : ");
	for (int k=0;k<n;k++) {
	    System.out.print((float) Alea.cauchy(a)+" ");
	}
	System.out.println();
    }

    public static void main(String[] arg) {
	if (arg.length!=2) {
	    System.out.println("Usage : java TirArc a n");
	    System.out.println("a = distance a la cible");
	    System.out.println("n = nombre de tirs");
	    System.out.println("Exemple : java TirArc 10 5");
	}
	else {
	    double a=Double.parseDouble(arg[0]);
	    int n=Integer.parseInt(arg[1]);
	    sequence(a,n);
	}
    }
}


