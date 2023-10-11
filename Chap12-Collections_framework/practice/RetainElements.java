import java.util.ArrayList;
import java.util.List;

public class RetainElements {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");


        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");

        list1.retainAll(list2);
        System.out.println(list1);
    }
}
