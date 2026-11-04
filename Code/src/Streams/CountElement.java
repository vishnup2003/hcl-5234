package Streams;
import java.util.ArrayList;
import java.util.List;

public class CountElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(40);
        list.add(4);
        list.add(18);
        list.add(67);

        long count=list.stream()
                .count();

        System.out.println(count);
    }
}

