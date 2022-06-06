import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();

        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("강자바", 90);
        map.put("박자바", 90);
        map.put("백자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("name:" + e.getKey() + "password:" + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set);

        Iterator it2 = map.values().iterator();

        int total = 0;

        while(it2.hasNext()){
            int i = (int)it2.next();
            total += i;
        }
        System.out.println("총점 : " + total);

    }
}
