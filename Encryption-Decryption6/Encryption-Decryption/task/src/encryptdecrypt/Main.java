package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
//    static String abc = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~";
    static String result = "";

    static String mode = "enc";
    static int key = 0;
    static String data = "";
    static String inData = "";
    static String outData = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                mode = args[i+1];
            } else if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i+1]);
            } else if (args[i].equals("-data")) {
                data = args[i+1];
            } else if (args[i].equals("-in")) {
                inData = ".\\" + args[i+1];
            } else if (args[i].equals("-out")) {
                outData = ".\\" + args[i+1];
            }
        }
        if (mode.equals("enc")) {
            if ("".equals(inData) || !"".equals(data)) {
                enc(data, key);
            } else {
                String fromFile = fileReading(inData);
                enc(fromFile, key);
            }
        } else {
            if (inData.equals("") || !data.equals("")) {
                dec(data, key);
            } else {
                String fromFile = fileReading(inData);
                dec(fromFile, key);
            }
        }
    }

    private static void enc(String str, int mod) {
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < abc.length(); j++) {
//                if (str.substring(i, i+1).equals(abc.substring(j, j+1))) {
//                    int fract = (j+mod)%abc.length();
//                    result = result + abc.substring(fract, fract+1);
//                    break;
//                }
//            }
//        }

        String result = "";
        for (char c : str.toCharArray()) {
            result += (char) (c+mod);
        }

        if (outData.equals("")){
            System.out.println(result);
        } else {
            fileWriting(result);
        }
    }

    private static void dec(String str, int mod) {
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < abc.length(); j++) {
//                if (str.substring(i, i+1).equals(abc.substring(j, j+1))) {
//                    int fract = (j-mod)%abc.length();
//                    result = result + abc.substring(fract, fract+1);
//                    break;
//                }
//            }
//        }

            String result = "";
            for (char c : str.toCharArray()) {
                result += (char) (c-mod);
            }

            if (outData.equals("")){
                System.out.println(result);
            } else {
                fileWriting(result);
            }
        }

        public static String fileReading (String inData) {
            File file = new File(inData);
            try (Scanner fileRead = new Scanner(file)) {
                data = fileRead.nextLine();
            } catch (Exception e){
                System.out.println("Error: " + e);
            }
        return data;
        }

        public static void fileWriting (String result) {
            File file = new File(outData);
            try (FileWriter write = new FileWriter(file)){
                write.write(result);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
}
