import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for(int i = 0; set.size() < 6; i++){
            int integer = (int) (Math.random() * 45) + 1;
//            set.add(new Integer(integer));
            set.add(Integer.valueOf(integer));
        }

        System.out.println(set);

        List list = new ArrayList(set);
        Collections.sort(list);

        System.out.println(list);

    }
}
