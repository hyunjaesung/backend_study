import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");

        Iterator it = list.iterator();

        while(it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }
    }
}
