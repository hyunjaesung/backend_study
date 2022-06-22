import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_5 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(new Student("김지수", 3, 100), new Student("성현제", 2, 90));
        studentStream.sorted(Comparator.comparing(Student::getBan).thenComparing(Student::getName)).forEach(System.out::println);

        Stream<Student> studentStream2 = Stream.of(new Student("김지수", 3, 100), new Student("성현제", 2, 90));
        studentStream2.sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int score;
    Student(String name, int ban, int score){
        this.name = name;
        this.ban = ban;
        this.score = score;
    }

    public String toString(){
        return name + ' ' + ban + '반';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int compareTo(Student s) {
        return s.score - this.score;
    }
}
