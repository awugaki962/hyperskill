// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int progress = 0;
        int days = 0;

        while (progress <= height) {
            progress += up;
            days++;
            if (progress >= height) {
                break;
            }
            progress -= down;
        }
        System.out.println(days);
    }
}