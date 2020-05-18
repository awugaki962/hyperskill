import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String a = sc.next().replace("'", "");
        String b = sc.next().replace("'", "");
        int len = str.length();
        String sub = a+b;
        int result = 0;

        for (int i=0; i<=len-2; i++) {
            if (str.substring(i, i+2).equals(sub)) {
                result++;
            }
        }
        System.out.println(result);
    }
}