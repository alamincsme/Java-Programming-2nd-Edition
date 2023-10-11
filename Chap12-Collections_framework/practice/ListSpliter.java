import java.util.ArrayList;
import java.util.List;

public class ListSpliter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("BJIT");
        list.add("Brain Station 23");
        list.add("Dynamic Solutions Lt.");
        list.add("Square Group.");
        list.add("Square Group.");

        List<List<String>> sublists = new ArrayList<>();
        int size = 2 ;

        for (int i = 0 ; i < list.size(); i = i + size) {
            sublists.add(list.subList(i, Math.min(i + size, list.size())));
        }

        for (List<String> sublist : sublists) {
            System.out.println(sublist);
        }
    }
}
