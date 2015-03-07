/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

class PhysiqueStat {

    /**
     * Systeme de particules elementaires
     * @param n nombre de particules
     * @param d duree de vie mediane de chaque particule
     * @return duree de vie du systeme
     */
    
    static double duree(int n,double d){
	double dmin = Integer.MAX_VALUE;
	for(int i = 0; i<n ; i++){
		dmin = Math.min(Alea.exponential(Math.log(2.)/d),dmin);
	}
	return dmin;
    }

    
    /**
     * Physique statistique
     * @param n nombre de particules
     * @param d duree de vie mediane de chaque particule
     * @param t temps de vie cible du systeme
     * @param m nombre de systemes
     * @return nombre de systemes de duree de vie au moins t
     */
    static int stat(int n,double d,double t,int m){
	int count=0;

	for (int l=0;l<m;l++) {
	    if (duree(n,d)>t)
		count++;
	}
	return count;
    }
    
    
    public static void main(String[] arg) {
	if (arg.length!=4) {
	    System.out.println("Usage : java PhysiqueStat n d t m");
	    System.out.println("n = nombre de particules");
	    System.out.println("d = duree de demi-vie de chaque particule (en annees)");
	    System.out.println("t = temps de vie cible du systeme (en annees)");
	    System.out.println("m = nombre de systemes");
	    System.out.println("Exemple : java PhysiqueStat 1000 1000 1 100");
	}
	else {
	    int n=Integer.parseInt(arg[0]);
	    double d=Double.parseDouble(arg[1]);
	    double t=Double.parseDouble(arg[2]);
	    int m=Integer.parseInt(arg[3]);
	    System.out.println("Fraction des "+m+" systemes durant plus de "+t+" an(s) : "+(float) stat(n,d,t,m)/m);
	}
    }
}


