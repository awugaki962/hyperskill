import java.util.*;

public class Main {

    public static int[] getFirstAndLast(int... numbers) {
        int[] num = new int[2];
            num[0] = numbers[0];
            num[1] = numbers[numbers.length-1];
        return num;
    }

    /* Do not change code below */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}