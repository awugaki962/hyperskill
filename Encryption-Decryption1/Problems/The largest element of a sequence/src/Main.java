import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int temp = 0;

        while (sc.nextInt() != 0) {
            max = sc.nextInt();
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}