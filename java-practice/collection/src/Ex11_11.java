import java.util.*;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        String[] strings = {"abc", "abc"};
        Person[] persons = {new Person("David", 10), new Person("David", 10)};

        set.addAll(Arrays.asList(strings));
        set.addAll(Arrays.asList(persons));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    // 아래 추가해야지 Set 에서 같은지 확인가능
    public boolean equals(Object obj){
        if(!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return name.equals(p.name) && age==p.age;
    }
    // 이거까지 추가해야지 HashSet에서 같은지 확인가능
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
