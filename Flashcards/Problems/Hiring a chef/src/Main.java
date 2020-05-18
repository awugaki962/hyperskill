//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine();
        String stage = scanner.nextLine();
        int years = scanner.nextInt();
        scanner.nextLine();
        String cuisine = scanner.nextLine();

        System.out.printf("The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.",
                name, cuisine);
    }
}
