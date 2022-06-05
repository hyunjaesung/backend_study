import java.util.*;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));
    }
}
class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Comparable)o1).compareTo((Comparable)o2) * -1; // String으로 변환해도 가능
    }
}

