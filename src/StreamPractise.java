import java.util.Arrays;
import java.util.List;

public class StreamPractise {

    void main(){
        fetchEvenNumbers();
    }

    public static void fetchEvenNumbers(){
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> evenNumbers = numbers.stream().filter(even -> even%2 ==0).toList();
    System.out.println(evenNumbers);
    }
}
