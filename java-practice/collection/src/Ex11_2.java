import java.util.*;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push(0);
        st.push(1);
        st.push(2);

        q.offer("0");
        q.offer("1");
        q.offer("2");

        // 아래 부분을 공통으로 만들고 싶다
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }
//
//        while(!q.isEmpty()){
//            System.out.println(q.poll());
//        }
        returnAndPrintAll(st);
        returnAndPrintAll(q);
    }

    static void returnAndPrintAll(Collection collection){
        if(collection instanceof Stack){
            while(!collection.isEmpty()){
                System.out.println(((Stack)collection).pop());
            }
        }else if(collection instanceof Queue){
            while(!collection.isEmpty()){
                System.out.println(((Queue)collection).poll());
            }
        }
    }
}
