import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Yacine on 10/23/2017.
 * une class principale pour les tests unitaires
 */
public class VectorHelperTest {
    @org.junit.Test
    public void vectorHelper() throws Exception {

    }

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
         * touts ces instructions sont équivalant a la ligne de code qui suit

          */
        assertTrue("ya une erreur dans la fonction sortVec", v.get(2) == 750);
        /**
         *if(v.get(2)!=750){
         *fail("erreur ya un bugue ");
         *}
         * touts ces instructions sont équivalant a la ligne de code qui suit

         */
        assertTrue("ya une erreur dans la fonction sortVec", v.get(2) == 750);

    }

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

}
