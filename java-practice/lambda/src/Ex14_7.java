import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(new String[]{"123", "242", "3434", "GDB"}, new String[]{"abc", "def", "gdb", "123"});

        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
    }
}
