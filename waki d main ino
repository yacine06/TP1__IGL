import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String [] args)throws Tail_DiffException
    {


        VectorHelper V = new VectorHelper();
        ArrayList<Double> R1 = new ArrayList<Double>();
        ArrayList<Double> R2 = new ArrayList<Double>();
        ArrayList<Double> RES = new ArrayList<Double>();


        System.out.println("Si vous disirer calculer la somme de deux vecteurs choisisez '1' pour les autres fonctionnalités choisisez'2' ");
        Scanner r = new Scanner(System.in);
        System.out.print("Saisisez votre choix  :   ");
        int reponse = r.nextInt();

        if(reponse == 1){

                System.out.print("donner la taille du vecteur 1    :   " );
                Scanner n1  = new Scanner(System.in);
                int tai1 = n1.nextInt();

                for (int j1 = 0; j1 < tai1; j1++) {
                    Scanner val1 = new Scanner(System.in);
                    System.out.print("T1[" + j1 + "] = ");
                    Double val = val1.nextDouble();
                    R1.add(val);
                }

                System.out.print("donner la taille du vecteur 2   :   ");
                Scanner n2  = new Scanner(System.in);
                int tai2 = n2.nextInt();

                for (int j2 = 0; j2 < tai2; j2++) {
                    Scanner val2 = new Scanner(System.in);
                    System.out.print("T1[" + j2 + "] = ");
                    Double val = val2.nextDouble();
                    R2.add(val);

                }


               RES =  V.Sommer_deux_vecteur(R1,R2);
                AffichVector(RES);
        }
        else {
            System.out.print("donner la taille du vecteur     :   " );
            Scanner n  = new Scanner(System.in);
            int tai = n.nextInt();

            for (int i = 0; i < tai; i++) {
                Scanner valr = new Scanner(System.in);
                System.out.print("T[" + i + "] = ");
                Double val = valr.nextDouble();
                R1.add(val);
            }

            System.out.println("Si vous disirer avoir l'inverse du vecteur choisisez '1' , et pour avoir le max et le min  choisisez'2' ");
            Scanner m = new Scanner(System.in);
            System.out.print("Saisisez votre choix  :   ");
            int reponse2 = m.nextInt();

            if(reponse2 == 1){

                RES = V.Inverser_Vector(R1);
                AffichVector(RES);
            }
            else{
                Double [] res = new Double[2];
                res = V.Max_et_Min(R1);
                System.out.println("Min : "+res[0]);
                System.out.println("Max : "+res[1]);
            }
        }
    }


    /**
     * pour afficher les valeurs d un vecteur
     * @param R : un vecteur de valeurs Double donner entre pour qu'il soit afficher
     */

    public static void AffichVector(ArrayList <Double> R ){

        for (int i = 0; i < R.size(); i++)
            System.out.println("T[" + i + "] = "+R.get(i));

    }

}
