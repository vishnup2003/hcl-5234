package Streams;
import java.util.*;

public class MaxMin {
    public static void main(String args[]) {

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(40);
        list1.add(4);
        list1.add(18);
        list1.add(67);

        int min=list1.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(min);


        int max=list1.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(max);

    }
}
