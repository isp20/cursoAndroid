import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ramirez on 01/05/2016.
 */



class Principal {
    public static void main(String[] main) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("manzana");
        conjunto.add("pera");
        conjunto.add("fresa");
        conjunto.add("naranja");
        conjunto.add("uva");
        conjunto.add("melon");
        conjunto.remove("pera");
        for(String s : conjunto) {
            System.out.println(s);
        }
    }

}
