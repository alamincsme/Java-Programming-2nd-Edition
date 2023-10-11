import java.util.ArrayList;
import java.util.List;

public class List_SetMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.set(4,100);
        System.out.println("The list : " + list);
    }
}
