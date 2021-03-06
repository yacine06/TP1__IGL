import java.util.ArrayList;
/** *********TP N_01 IGL Application 2 VectorHelper *******************
 * Morakeb Yacine -- Aboud Souad
 * Groupe 10
 * Email: fy_morakeb@esi.dz / fs_aboud@esi.dz
 * @author yacine
 *@version 3.0
 * Created by Yacine on 10/18/2017.
 */
public class VectorHelper {

    private ArrayList<Double> vecteur = new ArrayList<Double>();

    /**
     * un constreucteur par defaut de la class VectorHelper*/
    public void VectorHelper() {

    }

    /**
     * cette fonction permet de trie les elements d'un Vecteur et return on sorter un vecteur trie celon l'ordre croissant
     *
     * @param vec c'est un vecteur de type double dooner en entrer de la fonction
     * @return la fonction return le meme vecteur donner en entrer mais trie en ordre croissant
     */

    public  ArrayList<Double> SortVec(ArrayList<Double> vec ){
        /**
         * on a utiliser un trie par bulles */
        for (int i=0;i<vec.size();i++)
        {

            for (int j=0;j<vec.size()-1;j++){
                /**on test et on permute on utilisons une variable de sauvgarde */
                if (vec.get(j)>vec.get(j+1)){
                    /**x une variable pour le sauvgarde*/
                    Double x;
                    x=vec.get(j);
                    vec.set(j,vec.get(j+1));
                    vec.set(j+1,x);
                }
            }
        }


        return vec;
    }
    /**
     * cette fonction permet d'appliquer une formule mathematiques pour touts les elements de Vecteur
     *@since 3.0
     *@param vec c'est un vecteur de type double
     * @param f la formule a appliquer
     * @param n les donnees de la formule
     *@return
    le fonction return le meme vecteur donner en entrer on appliquns la formule donner en entrer a touts les elements de vecteur*/
    public  ArrayList<Double> VecForm(ArrayList<Double> vec, String f,int n){
        /**une fonction qui permet dappliquer une formule a toutes les elements de Vecteur*/
        if(f.equals("+")){

            /**l'addition*/
            for (int i=0;i<vec.size();i++) {
                vec.set(i,(vec.get(i)+n)) ;
            }
        }
        if(f.equals("-")){
            /**la sustraction*/

            for (int i=0;i<vec.size();i++) {
                vec.set(i,(vec.get(i)-n)) ;
            }
        }
        if(f.equals("*")){
            /**la multiplication*/

            for (int i=0;i<vec.size();i++) {
                vec.set(i,(vec.get(i)*n)) ;
            }
        }
        if(f.equals("/")){
            /**la devision*/

            for (int i=0;i<vec.size();i++) {
                vec.set(i,(vec.get(i)/n)) ;
            }
        }


        return vec;
    }


    /**
     *
     * @param V1 : c'est un vecteur de type arraylist initialiser avec des valeurs de type Double donner en entrer de la fonction
     * @param V2 : c'est un vecteur de type arraylist initialiser avec des valeurs de type Double donner en entrer de la fonction
     * @return  : une instance de ArrayList :correspont a un vecteur qui est le resultat de la somme des deux vecteurs donnes en entre
     * @throws Tail_DiffException      : Si jamais les deux vecteurs a sommer sont de taille differentes
     */

    public ArrayList<Double> Sommer_deux_vecteur(ArrayList<Double> V1 , ArrayList<Double> V2)throws Tail_DiffException
    {
        /**
         * on test la taille des deux vecteurs
         * si elle est différente on rentrera dans le 'IF', une exception sera lancer et la somme ne s'effectuera pas
         */
        if (V1.size() != V2.size())
        {
            throw new Tail_DiffException();
        }
        else{

            /**
             *  Sinon (la taille est la meme) on traite le 'else' et on fait la somme
             */


            for(int i = 0 ; i < V1.size(); i++) {
                this.vecteur.add( V1.get(i) + V2.get(i)) ;
            }

        }

        return vecteur ;
    }


    /**
     *
     * @param v :  c'est un vecteur de type ArrayList inisialis avec des valeurs Double
     * @return  : une instance de ArrayList, correspont a un vecteur qui contient les valeurs
     *              de vecteur donner on entrer mais qui seront inverses
     */

    public ArrayList<Double>  Inverser_Vector(ArrayList<Double>  v)
    {
        int i ;			int j = v.size();

        /**
         *  le vecteur de retour aura la meme taille avec le vecteur d'entre V
         * on parcour le vecteur V de la premiere case a la taille maximal et a chaque fois on affect la valeur lu
         * a une case de vecteur de retour mais en commençant par la taille maximal vers la premitere case
         */


        for(i = 0 ; i < v.size() ; i++)
        {
            this.vecteur.add(v.get(j-1));
            j--;
        }

        return vecteur;
    }

    /**
     *
     * @param v : c'est un vecteur de type ArrayList inisialise avec des valeurs Doubles
     */

    public Double [] Max_et_Min(ArrayList<Double> v){


        /**
         * on crre un vecteur de deux valeurs on met la premiere case pour le min et la 2eme pour le max
         */

        Double [] res  = new Double[2];

        /**
         * on inisialise le min a la premiere valeurs du vecteur V
         * on inisialise le max a la premiere valeurs du vecteur V
         */
        res[0] = v.get(0);
        res[1] = v.get(0);


        /**
         * on parcourt le vecteur V puis a chaque fois qand trouve une valeur inferieure au min( res[0] )
         * on ecrase ce dernier avec cette valeur ; meme chose pour le max (res[1] )
         */

        for (int i = 1 ; i < v.size() ; i++){

            if ( res[1] < v.get(i) )	{		res[1] = v.get(i) ; 		}
            if ( res[0] > v.get(i) )  { 		res[0] = v.get(i) ; 		}
        }


        /**
         * retourne les resultat trouver c'est a dire la valeur min et max sous forme d un vecteur
         */

        return (res);
    }




}
