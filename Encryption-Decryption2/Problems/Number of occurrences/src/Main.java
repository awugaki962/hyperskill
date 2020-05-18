import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String part = sc.nextLine();
        int partlen = part.length();
        int result = 0;

        for (int i = 0; i < str.length()-partlen; i++) {
            if (str.substring(i, i+partlen).equals(part)) {
                result++;
            }
        }
        System.out.println(result);
    }
}