import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        while (scanner.hasNext()) {
            result = scanner.next() + "\n" + result;
        }
        System.out.println(result);
    }
}