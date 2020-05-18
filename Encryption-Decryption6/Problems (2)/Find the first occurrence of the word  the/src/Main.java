import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = -1;
        String str = sc.nextLine().toLowerCase();

        if (str.contains("the")) {
            result = str.indexOf("the");
        }
        System.out.println(result);
    }
}