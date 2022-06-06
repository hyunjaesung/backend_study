import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable {
    String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return "이름: " + name;
    }

    public int compareTo(Object o) {
        return name.compareTo(((Student) o).name);
    }
}

public class Ex11_18 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("라구마"));
        list.add(new Student("노구마"));
        list.add(new Student("고구마"));
        list.add(new Student("다구마"));

        Collections.sort(list);
        Iterator it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
