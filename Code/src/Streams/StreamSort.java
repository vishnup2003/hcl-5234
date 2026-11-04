package Streams;
import java.util.*;
import java.util.stream.Collectors;

class empl{
    String name;
    int id;

    public empl(String name, int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "empl{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class StreamSort {
    public static void main(String args[]){

        ArrayList<empl> list=new ArrayList<>();

        list.add(new empl("krishna",1));
        list.add(new empl("suraj",3));
        list.add(new empl("sona",2));
        list.add(new empl("nikil",5));
        list.add(new empl("nirak",4));

        List<empl> ans=list.stream()
                .sorted((e1,e2)->Integer.compare(e1.id,e2.id))
                .collect(Collectors.toList());

        System.out.println(ans);

        list.stream()
                .sorted((e1,e2)->Integer.compare(e1.id,e2.id));
        System.out.println(list);

    }
}
