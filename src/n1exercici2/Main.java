package n1exercici2;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);

        List<Integer> numbers2 = new ArrayList<Integer>();

        for (ListIterator<Integer> it = numbers.listIterator(numbers.size()); it.hasPrevious();)
            {numbers2.add(it.previous());}

        System.out.println(numbers);
        System.out.println(numbers2);

    }

}

