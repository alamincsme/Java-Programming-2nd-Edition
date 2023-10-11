import java.util.ArrayList;
import java.util.List;

public class SublistExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 10; i >= 1; i--) {
            list.add(i);
        }

        List<Integer> subList = list.subList(2,5);
        System.out.println("Sublist : " + subList);
    }
}
