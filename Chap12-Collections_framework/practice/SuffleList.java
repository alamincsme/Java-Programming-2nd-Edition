import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuffleList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 10 ; i >= 1; i--) {
            list.add(i);
        }

        Collections.shuffle(list);
        System.out.println(list);
    }
}
