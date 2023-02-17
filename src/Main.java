import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    static ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 4, 5, 5, 6 ));

    public static void sortingFunction () {

        List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());

        System.out.println("Результат" + listWithoutDuplicates);
    }

    public static void main(String[] args) {

        sortingFunction();

    }
}
