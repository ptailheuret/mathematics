/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */


class Physique {

    /**
     * Particules élémentaires
     * @param d duree de vie mediane
     * @param n nombre de particules
     */
    
    static void sequence(double d,int n){
	
	System.out.print("Durees de vie de "+n+" particules : ");
	for (int k=0;k<n;k++) {
	    System.out.println("Particule "+k+ " : " +Alea.exponential(Math.log(2.)/d));
	}
    }
    
    public static void main(String[] arg) {
	if (arg.length!=2) {
	    System.out.println("Usage : java Physique p n");
	    System.out.println("d = duree de vie mediane");
	    System.out.println("n = nombre de particules");
	    System.out.println("Exemple : java Physique 100 100");
	}
	else {
	    double d=Double.parseDouble(arg[0]);
	    int n=Integer.parseInt(arg[1]);
	    sequence(d,n);
	}
    }
}


