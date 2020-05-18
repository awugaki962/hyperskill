package encryptdecrypt;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode = sc.nextLine();
        String str = sc.nextLine();
        int mod = sc.nextInt();
        str = str.toLowerCase();
        if (mode.equals("enc")) {
            System.out.println(enc(str, mod));
        }
    }

    public static String enc (String str, int mod) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < abc.length(); j++) {
                if (str.substring(i, i + 1).equals(abc.substring(j, j + 1))) {
                    int fract = (j + mod) % 26;
                    result = result + abc.substring(fract, fract + 1);
                    break;
                }
                if (str.substring(i, i + 1).equals(" ")) {
                    result = result + " ";
                    break;
                }
            }
        }
        return result;
    }
}
