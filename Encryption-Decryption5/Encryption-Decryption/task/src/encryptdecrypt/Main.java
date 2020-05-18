package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String mode = scanner.nextLine().toLowerCase();
        final String message = scanner.nextLine();
        final int key = scanner.nextInt();
        final char[] messageAsArray = message.toCharArray();

        String processedMessage = encryptAndDecrypt(messageAsArray, key, mode);

        System.out.println(processedMessage);
    }

    // Unicode valid  values go from 32 - 126 -> 94 total values.

    public static String encryptAndDecrypt(char[] messageAsArray, int key, String mode) {

        final StringBuilder finalMessage = new StringBuilder("");
        boolean isValidCharacter = false;

        for (char characterInMessage : messageAsArray) {

            int charValue = (int) characterInMessage;
            isValidCharacter = characterInMessage >= 32 && characterInMessage <= 126;

            if (isValidCharacter) {

                switch (mode) {

                    case "enc":

                        int encryptedCharValue = (int) (charValue + Math.ceil(key % 94));

                        if (encryptedCharValue > 126) {

                            encryptedCharValue = encryptedCharValue - 126 + 31;
                        }

                        finalMessage.append((char) encryptedCharValue);
                        break;
                    case "dec":

                        int decryptedCharValue = (int) (charValue - Math.ceil(key % 94));

                        if (decryptedCharValue > 126) {

                            decryptedCharValue = decryptedCharValue + 126 - 31;
                        }

                        finalMessage.append((char) decryptedCharValue);
                        break;
                    default:
                        finalMessage.append(characterInMessage);
                }
            } else {

                finalMessage.append(characterInMessage);
            }
        }

        return finalMessage.toString();
    }
}
