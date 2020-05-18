import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String first = str.substring(0, 2);
        String last = str.substring(3, 5);



        if (firstsum == lastsum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}