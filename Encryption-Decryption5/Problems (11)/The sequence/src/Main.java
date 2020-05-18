import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largest = 0;
        int count = 0;
        int number = 0;

        while (count < num) {
            number = sc.nextInt();
            if (number % 4 == 0 && number > largest) {
                largest = number;
            }
            count++;
        }
        System.out.println(largest);
    }
}