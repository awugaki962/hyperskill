import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int temp;

        do {
            temp = sc.nextInt();
            if (temp > max) {
                max = temp;
            }
        } while (temp != 0);
        System.out.println(max);
    }
}