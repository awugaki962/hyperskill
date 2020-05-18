import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int temp = 0;
        int count = 1;

        if (str.equals("")) {
            System.out.println(0);
        } else {
            for (int i = 1; i < len; i++) {
                if (str.substring(i, i + 1).equals(str.substring(i - 1, i))) {
                    temp++;
                }
                if (temp > count) {
                    count = temp;
                }
            }
            System.out.println(count);
        }
    }
}