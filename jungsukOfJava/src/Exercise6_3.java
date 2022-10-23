public class Exercise6_3 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println(s.getTotal());
        System.out.println(s.getAverage());
    }
}

class Student3 {
    String name;
    int kor;
    int eng;
    int math;
//    Student3(String name, int kor, int eng, int math) {
//        name = name;
//        kor = kor;
//        eng = eng;
//        math = math;
//    }

    int getTotal(){
        return kor + eng + math;
    }

    float getAverage(){
        return (int)(getTotal() / 3f * 100) / 100f;
    }
}