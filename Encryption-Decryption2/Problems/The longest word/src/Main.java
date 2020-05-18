import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        int longest = 0;
        String result = "";

        for (int i=0; i<parts.length; i++) {
            if (longest < parts[i].length()) {
                longest = parts[i].length();
                result = parts[i];
            }
        }
        System.out.println(result);
    }
}