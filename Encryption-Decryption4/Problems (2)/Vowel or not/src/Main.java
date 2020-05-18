import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        char[] arr = {'a', 'A', 'e', 'E', 'i', 'I', 'u', 'U', 'o', 'O'};
        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) {
                return true;
            }
        }
        return false;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}