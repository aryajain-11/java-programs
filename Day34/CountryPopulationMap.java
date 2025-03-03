import java.util.TreeMap;

public class CountryPopulationMap {
    public static void main(String[] args) {
        TreeMap <String,Integer> treemap = new TreeMap<>();
        treemap.put("India", 5689900);
        treemap.put("USA", 876000000);
        treemap.put("China",744000000);


        System.out.println("Country Population Data: " + treemap);

    }
    
}
