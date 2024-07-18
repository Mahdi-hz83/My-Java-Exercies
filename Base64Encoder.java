package org.example;

import java.util.ArrayList;
import java.util.List;

public class Base64Encoder {

    public String encode(String txt){
        String binary = asciiToBinaryString(txt);
        List<String> chunks = divideBinaryString(binary);
        List<Integer> decimals = binaryToDecimal(chunks);
        return decimalToAlphabet(decimals);
    }

    private String asciiToBinary(char c){
        String binaryString = Integer.toBinaryString(c);
        return String.format("%8s" , binaryString).replace(" ", "0");
    }

    private String asciiToBinaryString(String txt){
        StringBuilder binary = new StringBuilder();
        for (char c : txt.toCharArray()) {
            binary.append(asciiToBinary(c));
        }
        return binary.toString();
    }

    private List<String> divideBinaryString(String txt){
        int length = 6;
        List<String> chunks = new ArrayList<>();
        for (int i = 0 ; i < txt.length() ; i+=length){
            int endIndex = Math.min(i + length, txt.length());
            chunks.add(txt.substring(i, endIndex));
        }
        return chunks;
    }
    private List<Integer> binaryToDecimal(List<String> chunks){
        List<Integer> decimals = new ArrayList<>();
        for (String binaryString : chunks) {
            int decimal = Integer.parseInt(binaryString, 2);
            decimals.add(decimal);
        }
        return decimals;
    }

    private String decimalToAlphabet(List<Integer> decimals) {
        StringBuilder sb = new StringBuilder();
        for (int number : decimals) {
            if (number >= 0 && number <= 25) {
                sb.append((char) ('A' + number));
            } else if (number >= 26 && number <= 51) {
                sb.append((char) ('a' + number - 26));
            } else {
                sb.append(number - 52);
            }
        }
        return sb.toString();
    }
}




