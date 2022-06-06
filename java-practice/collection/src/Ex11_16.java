import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("id와 패스워드를 입력하소서");
            System.out.print("id: ");
            String id = scan.nextLine().trim();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다");
                continue;
            }
            System.out.print("password: ");
            String password = scan.nextLine().trim();
            System.out.println();

            if (map.get(id).equals(password)) {
                System.out.println("id와 비민ㄹ번호가 일치합니다");
                break;
            } else {
                System.out.println("입력하신 비밀번호는 일치하지 않습니다 다시 입력해주시에");
            }
        }
    }
}
