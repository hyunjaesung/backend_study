public class Exercise9_3 {
    public static int count(String src, String target) {
        int count = 0;
        for(int i = 0; i < src.length() - target.length() + 1; i++){
            if(src.substring(i, i + target.length()).equals(target)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count("1234AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}
