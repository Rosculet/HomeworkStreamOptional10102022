import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        // Ex.1
        List<String> stringArrayList = new ArrayList<>(List.of("Highload", "High", "Load", "Highload"));

        System.out.println(stringArrayList.stream().
                filter(x -> x.equals("Highload")).
                count());

        System.out.println(stringArrayList.stream().findFirst().orElse("0"));

        // Ex.2 
        Stream.of("f10", "f15", "f2", "f4", "f4").
                sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);




    }
}