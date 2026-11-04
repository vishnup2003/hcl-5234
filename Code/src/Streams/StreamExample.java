package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String args[]){

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(40);
        list1.add(4);
        list1.add(18);
        list1.add(67);

        List<Integer> list2 = list1.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

        //list2.forEach(n -> System.out.println(n));

        // System.out.print(list2);


    }
}
