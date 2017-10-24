import java.util.ArrayList;

/**
 * Created by Yacine on 10/19/2017.
 */
public class main {

    public static void main(String[]args){
        ArrayList<Double> v =new ArrayList<Double>();
        v.add((double) 750);
        v.add((double) 50);
        v.add((double) 29);


        VectorHelper R =new VectorHelper();
        R.SortVec(v);
        for (int j =0 ;j<v.size();j++){
            System.out.println("R["+v.get(j)+"]");
        }
        R.VecForm(v,"*",2);
        for (int j =0 ;j<v.size();j++){
            System.out.println("R["+v.get(j)+"]");
        }
    }
}
