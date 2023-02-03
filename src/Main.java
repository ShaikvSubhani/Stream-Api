import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //to get even numbers from the list
        //1> without using stream api
        List<Integer> list= List.of(13,14,25,19,20);
        List<Integer> listeven=new ArrayList<>();
        for(int i: list)
        {
            if(i%2==0)
                listeven.add(i);
        }

        System.out.println(listeven);

        //2> using Stream api
        Stream<Integer> stream=list.stream();
        List<Integer> le=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(le);

        //3>

        List<Integer> ll=list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(ll);
    }
}