
import javax.swing.*;
import java.util.*;
import java.util.function.*;

public class Ex14_2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> consumer = i -> System.out.println(i + ",");
        IntPredicate predicate = i -> i % 2 == 0;
        IntUnaryOperator function = i -> i / 10 * 10;

        List<Integer> list = new ArrayList<Integer>();
        makeRandomList(supplier, list);
        System.out.println(list);

        ArrayList<Object> objectList = null;
        ArrayList<String> stringList = null;
//        stringList = (ArrayList<String>)objectList;


    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i = 0; i< 10; i++){
            list.add(s.get());
        }
    }
}
