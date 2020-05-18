// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 42;
        int thousand = number/1000;
        int hundred = number/100%10;
        int ten = number/10%10;
        int one = number%10;

        if (thousand == one && hundred == ten) {
            result = 1;
        }
        System.out.println(result);
    }
}