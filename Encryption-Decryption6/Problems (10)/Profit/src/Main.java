// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextDouble();
        double k = scanner.nextInt();
        int result = 0;

        while (m < k) {
            m = m + m * (p / 100);
            result++;
        }
        System.out.println(result);
    }
}