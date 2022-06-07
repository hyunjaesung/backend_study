import java.util.ArrayList;

public class Exercise9_5 {
    public static String delChar(String src, String delCh) {
//        StringBuilder result = new StringBuilder(src.length());
        String result = "";
        for (char c : src.toCharArray()) {
            if(delCh.contains(Character.toString(c))) continue;
//            result.append(c);
            result = result.concat(Character.toString(c));
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5) 변환 : " + delChar("(1!2@3^4~5)", "~!@$%^&*()"));
    }
}
