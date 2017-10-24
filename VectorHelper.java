import java.util.ArrayList;
/**@author yacine
*@version 3.0
 * Created by Yacine on 10/18/2017.
 */
public class VectorHelper {
   
     private ArrayList<Double> vecteur = new ArrayList<Double>();
    private Double Max;
    private Double Min;
    
    
    /**
     * un constreucteur par defaut de la class VectorHelper*/
    public void VectorHelper() {

    }

    /**
     * cette fonction permet de trié les éléments d'un Vecteur et return on sorter un vecteur trié celon l'ordre croissant
     *
     * @param vec c'est un vecteur de type double dooner en entrer de la fonction
     * @return le fonction return le meme vecteur donner en entrer mais trié
     */

    public  ArrayList<Double> SortVec(ArrayList<Double> vec ){
        /**on a utiliser un trié par bulles */
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
     * cette fonction permet d'appliquer une formule mathématiques pour touts les éléments de Vecteur
      *@since 3.0
        *@param vec c'est un vecteur de type double
        * @param f la formule a appliquer
        * @param n les données de la formule
        *@return

        le fonction return le meme vecteur donner en entrer on appliquns la formule donner en entrer a touts les éléments de vecteur*/
    public  ArrayList<Double> VecForm(ArrayList<Double> vec, String f,int n){
        /**une fonction qui permet dappliquer une formule a toutes les éléments de Vecteur*/
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
            /**la dévision*/

            for (int i=0;i<vec.size();i++) {
                vec.set(i,(vec.get(i)/n)) ;
            }
        }


        return vec;
    }

    
   

    /////**************************************   Somme 2 vecteurs 	*********************************///////


    public ArrayList<Double> Sommer_deux_vecteur(ArrayList<Double> V1 , ArrayList<Double> V2)throws Tail_DiffException
    {

        if (V1.size() != V2.size())
        {
            throw new Tail_DiffException();
        }
        else{

            int i ;

            for( i = 0 ; i < V1.size(); i++) {
                this.vecteur.add( V1.get(i) + V2.get(i)) ;
            }

        }

        return vecteur ;
    }



    /////**********************************	  Inverser elements d un vecteur   ************************///////

    public ArrayList<Double>  Inverser_Vector(ArrayList<Double>  v)
    {
        int i ;			int j = v.size();



        for(i = 0 ; i < v.size() ; i++)
        {
            this.vecteur.add(v.get(j-1));
            j--;
        }

        return vecteur;
    }


    /////********************************		Min et Max d un vecteur 	*****************************///////

    public void Max_et_Min(ArrayList<Double> v){

        int i ;

        this.Max = v.get(0);
        this.Min = v.get(0);

        for (i = 1 ; i < v.size() ; i++){

            if ( this.Max < v.get(i) )	{		this.Max = v.get(i) ; 		}
            if ( this.Min > v.get(i) )  { 		this.Min = v.get(i) ; 		}
        }

        System.out.println("le maximum de ce vecteur est  :    "+this.Max);
        System.out.println("le minimum de ce vecteur est  :    "+this.Min);


    }



    /////********************************		Afficher un vecteur 	*****************************///////

    public void AffichVector(){
        int i ;

        for(i = 0 ; i < this.vecteur.size() ; i++)
        {
            System.out.println("T["+i+"] = "+this.vecteur.get(i));
        }

    }



}
