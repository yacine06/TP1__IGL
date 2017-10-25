import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author yacine morakeb
 * /** *********TP N_01 IGL Application 2 VectorHelper *******************
 * Morakeb Yacine -- Aboud Souad
 * Groupe 10
 * Email: fy_morakeb@esi.dz / fs_aboud@esi.dz
 * @version 3.0
 * Created by Yacine on 10/18/2017.
 * une class principale pour les tests unitaires qu'on utilise pour assurer la validité des fonctions
 */
public class VectorHelperTest {
    @org.junit.Test
    public void vectorHelper() throws Exception {

    }

    /**
     *  test méthode sortVec()
     * @throws Exception une exception ce génere automatiquement on ca d'erreur
     */

    @org.junit.Test
    public void sortVec() throws Exception {

        VectorHelper  R = new VectorHelper();
        ArrayList<Double> v =new ArrayList<Double>();
        v.add((double) 750);
        v.add((double) 50);
        v.add((double) 29);
        R.SortVec(v);
        /**
         *if(v.get(0)!=29){
         *fail("erreur ya un bugue ");
         *}
         * touts ces instructions sont equivalant a la ligne de code qui suit

          */
        assertTrue("ya une erreur dans la fonction sortVec", v.get(2) == 750);
        /**
         *if(v.get(2)!=750){
         *fail("erreur ya un bugue ");
         *}
         * touts ces instructions sont equivalant a la ligne de code qui suit

         */
        assertTrue("ya une erreur dans la fonction sortVec", v.get(2) == 750);

    }
/**
 * test methode vecForm();
 */

    @org.junit.Test
    public void vecForm() throws Exception {
        VectorHelper  R = new VectorHelper();
        ArrayList<Double> v =new ArrayList<Double>();
        v.add((double) 840);
        v.add((double) 33);
        v.add((double) 12);
        v.add((double) 21);

        /**
         * l'addition
         * */
        R.VecForm(v, "+",2);
        assertTrue("ya une erreur dans la fonction VecForm addition", v.get(0) == 842);
        assertTrue("ya une erreur dans la fonction VecForm addition", v.get(1) == 35);
        assertTrue("ya une erreur dans la fonction VecForm addition", v.get(2) == 14);
        assertTrue("ya une erreur dans la fonction VecForm addition", v.get(3) == 23);
        /**
         * la soustraction
         * */
        R.VecForm(v, "-",2);
        assertTrue("ya une erreur dans la fonction VecForm soustraction", v.get(0) == 840);
        assertTrue("ya une erreur dans la fonction VecForm soustraction", v.get(1) == 33);
        assertTrue("ya une erreur dans la fonction VecForm soustraction", v.get(2) == 12);
        assertTrue("ya une erreur dans la fonction VecForm soustraction", v.get(3) == 21);
        /**
         * la multiplication
         */
        R.VecForm(v, "*",2);
        assertTrue("ya une erreur dans la fonction VecForm miltiplication", v.get(0) == 1680);
        assertTrue("ya une erreur dans la fonction VecForm multiplication", v.get(1) == 66);
        assertTrue("ya une erreur dans la fonction VecForm multiplication", v.get(2) == 24);
        assertTrue("ya une erreur dans la fonction VecForm miltiplication", v.get(3) == 42);
        /**
         *la division
         * */
        R.VecForm(v, "/",2);
        assertTrue("ya une erreur dans la fonction VecForm miltiplication", v.get(0) == 840);
        assertTrue("ya une erreur dans la fonction VecForm multiplication", v.get(1) == 33);
        assertTrue("ya une erreur dans la fonction VecForm multiplication", v.get(2) == 12);
        assertTrue("ya une erreur dans la fonction VecForm miltiplication", v.get(3) == 21);


    }

    
     @org.junit.Test
    public void sommer_deux_vecteur() throws Exception {

        /**
         * crrer un instance de VectorHelper
         */
        VectorHelper V = new VectorHelper();

        /**
         * pour faire la somme on aura besion de deux vecteurs
         * crrer le premier vecteur puis le remplit avec des valeurs Double
         */
        ArrayList <Double> R1 = new ArrayList<Double>();
        R1.add(0.0);
        R1.add(0.0);
        R1.add(10.5);
        R1.add(-15.0);
        R1.add(20.0);


        /**
         * crrer le deuxième vecteur puis le remplit avec des valeurs Double
         */

        ArrayList <Double> R2 = new ArrayList<Double>();
        R2.add(10.0);
        R2.add(-10.0);
        R2.add(20.5);
        R2.add(-30.0);
        R2.add(-25.0);

        /**
         * appler la methode qui somme les deux vecteurs
         */
        R1 = V.Sommer_deux_vecteur(R1,R2);

        assertTrue("il fait pas la somme d'un zero et un nombre positive", R1.get(0) == 10.0);
        assertTrue("il fait pas la somme d'un zero et un nombre négative", R1.get(1) == -10.0);
        assertTrue("il fait pas la somme de deux nombres positives", R1.get(2) == 31.0);
        assertTrue("il fait pas la somme de deux nombres négatives", R1.get(3) == -45.0);
        assertTrue("il fait pas la somme d'un nombre négative avec un nombre positive", R1.get(4) == -5.0);


    }




    @org.junit.Test
    public void inverser_Vector() throws Exception {

        /**
         * crrer un instance de VectorHelper
         */
        VectorHelper V = new VectorHelper();

        /**
         * crrer un vecteur puis le remplit avec des valeurs Double
         */
        ArrayList <Double> R = new ArrayList<Double>();
        R.add(1.0);
        R.add(3.0);
        R.add(8.5);
        R.add(11.0);
        R.add(15.0);


        /**
         * appler la methode qui inverse un vecteur
         * on crreé un vecteur où on metterera le resultat
         */


        ArrayList <Double> R2 = new ArrayList<Double>();
        R2 = V.Inverser_Vector(R);

        assertTrue("le vecteur n etait pas bien inverser", R2.get(0) == 15.0);
        assertTrue("le vecteur n etait pas bien inverser", R2.get(1) == 11.0);
        assertTrue("le vecteur n etait pas bien inverser", R2.get(2) == 8.5);
        assertTrue("le vecteur n etait pas bien inverser", R2.get(3) == 3.0);
        assertTrue("le vecteur n etait pas bien inverser", R2.get(4) == 1.0);

    }

    @org.junit.Test
    public void max_et_Min() throws Exception {

        /**
         * crrer un instance de VectorHelper
         */
        VectorHelper V = new VectorHelper();

        /**
         * crrer le vecteur puis le remplit avec des valeurs Double
         */
        ArrayList <Double> R = new ArrayList<Double>();
        R.add(4.0);
        R.add(13.0);
        R.add(25.5);
        R.add(56.0);
        R.add(155.0);


        /**
         * appler la methode qui ne calcule le min et le max d un vecteur
         * on crreé un vecteur où on metterera le resultat
         */


       Double[] res = new Double[2];
        res = V.Max_et_Min(R);

        assertTrue("cette valeur trouvée n est pas le minimum de ce vecteur", res[0] ==4.0);
        assertTrue("cette valeur trouvée n est pas le maximum de ce vecteur", res[1] == 155.0);

    }

    
}
