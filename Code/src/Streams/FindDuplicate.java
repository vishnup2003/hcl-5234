package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,3,9,3,2,9,10,11,11));
        List<Integer> check=new ArrayList<>();
//        List<Integer> ans=new ArrayList<>();

//      list.stream()
//                .map(n->check.contains(n) ? ans.add(n):check.add(n))
//                        .collect(Collectors.toList());
//

        List<Integer> ans = list.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(ans);
    }
}
