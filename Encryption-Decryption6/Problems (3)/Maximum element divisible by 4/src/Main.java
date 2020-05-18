import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howMany = scanner.nextInt();
        int result = 0;
        int number;

        for (int i = 0; i < howMany; i++) {
            number = scanner.nextInt();
            if (number % 4 == 0 && number > result) {
                result = number;
            }
        }
        System.out.println(result);
    }
}