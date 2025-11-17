package dsa.practise.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"Priyanka","Soni","Ajay","Rama","Madhavaditya"};
        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Priyanka");
        listOfNames.add("So");
        // "Soni" = 'S','o','n','i' - s.index(2)
//        Arrays.stream(arr).map(s -> s.toCharArray()).filter(s -> s.length > 4).map(s->s[4]).forEach(System.out::println);

        listOfNames.stream().filter(s -> s.length() > 2).forEach(s -> System.out.println(s.charAt(2)));
//        Arrays.stream(arr).filter(s -> s.length() > 2).forEach(s -> System.out.println(s.charAt(2)));

        String s2 = "15-11-2025";
        //output = "11/15/2025";

    }

}
