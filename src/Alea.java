/** Auteur : Thomas Bonald
 *  Cours MDI104, Telecom ParisTech
 *  2013-2014
 */

import java.util.Random;
class Alea {

    /** 
     * Nouveau generateur aleatoire 
     */
    
    static Random alea = new Random(); 

    /**
     * @return variable aleatoire uniforme sur [0,1]
     */
    
    static double uniform(){
	return alea.nextDouble();
    }
    
    /**
     * @param p parametre de la loi de Bernoulli (0<= p <= 1)
     * @return variable aleatoire de Bernoulli 
     */
    
    static boolean bernoulli(double p){
    	double variable = uniform();
    	return (variable < p);
    }
    
    /**
     * @param lambda parametre de la loi exponentielle (lambda>0)
     * @return variable aleatoire exponentielle
     */
    
    static double exponential(double lambda){
    	double variable = uniform();
    	return (-1/lambda * Math.log(1-variable)) ;
    }
    
    /**
     * @param parametre de la loi de Cauchy (a>0)
     * @return variable aleatoire de Cauchy 
     */
    
    static double cauchy(double a){
	double variable = uniform();
	return (a*Math.tan(Math.PI *(variable - 0.5)));
    }
}