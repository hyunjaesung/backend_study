import java.util.*;


public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(6);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));

        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);

        print(list1, list2);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));

        list2.add("A");
        list2.add("B");

        list2.add(0, "C");

        print(list1, list2);

        System.out.println("list1.retainAll(list2):"  + list1.retainAll(list2));

        print(list1, list2);

        for(int i = 0; i < list1.size(); i++){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }

        print(list1, list2);

    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("Array1:"+ list1);
        System.out.println("Array2:"+ list2);
    }
}
