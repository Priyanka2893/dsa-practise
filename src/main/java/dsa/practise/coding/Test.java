package dsa.practise.coding;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"Priyanka","Soni","Ajay","Rama","Madhavaditya"};
        // "Soni" = 'S','o','n','i' - s.index(2)
        Arrays.stream(arr).map(s -> s.toCharArray()).filter(s -> s.length > 4).map(s->s[4]).forEach(System.out::println);
    }
}
