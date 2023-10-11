import java.util.*;

public class MapSorter {
    public static void main(String[] args) {
        Map<String, Integer> country = new HashMap<>();
        country.put("Bangladesh", 1);
        country.put("India", 2);
        country.put("UAE", 4);
        country.put("America", 3);



        List<Map.Entry<String, Integer> > list = new ArrayList<>(country.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());

            }
        });


        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
//        output:
//        Bangladesh 1
//        India 2
//        America 3
//        UAE 4
    }
}
