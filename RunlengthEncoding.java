package deki2_2425_de1.rle;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RunlengthEncoding {
    public static void main(String[] args) {
        testEncoding();
        testDecoding();

        /*
        TODO:


        - Viết các hàm test mã hóa và giải mã theo mã hóa run-length và in ra theo mẫu:
        Ví dụ:
        Decoded Text: xxxxx
        Encoded Text: xxxxx



        và

        Encoded Text: xxxxx
        Decoded Text: xxxxx


         */
    }

    /*
     * Hàm mã hóa chuỗi ký tự text theo mã hóa run-length.
     */
    public static String encoding(String text) {
        /* TODO */
        StringBuffer sb = new StringBuffer();
        int count;
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            count = 1;
            for (int j = i + 1; j < text.length(); j++) {
                char c2 = text.charAt(j);
                if (c == c2) {
                    count++;
                    i++;
                }else {
                    sb.append(count).append(c);
                    i++;
                    break;
                }
            }
            if(i == text.length() - 1){
                sb.append(count).append(c);
                break;
            }
        }
        return sb.toString();

    }

    /*
     * Hàm giải mã chuỗi ký tự text theo mã hóa run-length.
     */
    public static String decoding(String text) {
        /* TODO */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < text.length(); i = i + 2) {
            char c = text.charAt(i);
            char c2 = text.charAt(i + 1);
            for (int j = 0; j < c - '0'; j++) {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    /*
     * Hàm test mã hóa theo mã hóa run-length.
     */
    public static void testEncoding() {
        /* TODO */
        String decodedtext = "aaaaabcccaa";
        System.out.print("Decoded Text: " + decodedtext);
        System.out.println();
        System.out.println("Encoded Text: " + encoding(decodedtext));
    }

    /*
     * Hàm test giải mã theo mã hóa run-length.
     */
    public static void testDecoding() {
        /* TODO */
        String encodedtext = "3e4f2e";
        System.out.print("Encoded Text: " + encodedtext);
        System.out.println();
        System.out.println("Decoded Text: " + decoding(encodedtext));
    }
}

