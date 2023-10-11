import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("BJIT");
        list.add("Brain Station 23");
        list.add("Dynamic Solutions Lt.");
        list.add("Square Group.");
        list.add("Square Group.");


        Set<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);
    }
}
