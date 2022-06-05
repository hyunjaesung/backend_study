import java.util.*;

public class Ex11_8 {
    public static void main(String[] args) {
        Integer[] arr = {30, 20, 10, 40, 20};

        Arrays.sort(arr); // Integer 내부의 compareTo 구현한 것 따라 정렬
        System.out.println(Arrays.toString(arr));

        class DescComp implements Comparator{
            public int compare(Object o1, Object o2) { // compareTo와 다르게 역정렬 하기위해서
                if(o1 instanceof Integer && o2 instanceof Integer){
                    return (((Integer) o1).compareTo((Integer) o2)) * -1;
                }
                return -1;
            }
        }

        Arrays.sort(arr, new DescComp());

        System.out.println(Arrays.toString(arr));
    }
}
