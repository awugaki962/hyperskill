import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 1;
        int marker = 0;

        while (counter <= number) {
            for (int i = 0; i < counter; i++) {
                System.out.print(counter + " ");
                marker++;
                if (marker == number) {
                    return;
                }
            }
            counter++;
        }
    }
}