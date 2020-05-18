import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double a;
        double b;
        double c;
        double s;
        double r;

        switch (shape) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                s = (a + b + c) * 0.5;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;

            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(a * b);
                break;

            case "circle":
                r = scanner.nextInt();
                System.out.println(3.14 * r * r);
                break;
        }
    }
}