// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            result = result + str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        System.out.println(result);
    }
}
