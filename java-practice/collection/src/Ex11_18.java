import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student implements Comparable {
    String name;
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

    public String toString() {
        return "이름: " + name + " 반: " + ban + " 번호: " + no;
    }

    public int compareTo(Object o) {
        return name.compareTo(((Student) o).name);
    }
}

class BanNoAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Student && o2 instanceof Student)) return -1;
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.ban == s2.ban) {
            return s1.no - s2.no;
        } else {
            return s1.ban - s2.ban;
        }
    }
}

public class Ex11_18 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student("라구마", 1, 20));
        list.add(new Student("노구마", 1, 14));
        list.add(new Student("고구마", 2, 13));
        list.add(new Student("다구마", 3, 15));

        Collections.sort(list, new BanNoAscending());
        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
