package Streams;
import java.util.*;
import java.util.stream.Collectors;

class gender{

    String name;
    String gen;

    gender(String name, String gen){

        this.name=name;
        this.gen=gen;
    }

    @Override
    public String toString() {
        return "gender{" +
                "name='" + name + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}

public class UseOfMap {
    public static void main(String args[]) {

        ArrayList<gender> list1 = new ArrayList<>();

        list1.add(new gender("komal", "F"));
        list1.add(new gender("krishna", "M"));
        list1.add(new gender("suresh", "M"));
        list1.add(new gender("raghav", "M"));
        list1.add(new gender("nisha", "F"));


        List<String> list2 = list1.stream()
                .map(gender -> gender.gen.equals("M")
                        ? "Mr. " + gender.name
                        : "Mrs. " + gender.name)
                .collect(Collectors.toList());

        System.out.println(list2);


    }
}
