package org.example;

public class Base64Decoder {
    public static String decodeBase64(String encodedString) {
        byte[] base64Bytes = encodedString.getBytes();
        int length = base64Bytes.length;

        while (length > 0 && base64Bytes[length - 1] == '=') {
            length--;
        }

        int decodedLength = (length * 6 + 7) / 8;
        byte[] decodedBytes = new byte[decodedLength];

        int dataIndex = 0;
        int outputIndex = 0;
        int bits = 0;
        int bitCount = 0;

        for (int i = 0; i < length; i++) {
            char c = (char) base64Bytes[i];
            int value = (c >= 'A' && c <= 'Z') ? c - 'A'
                    : (c >= 'a' && c <= 'z') ? c - 'a' + 26
                    : (c >= '0' && c <= '9') ? c - '0' + 52
                    : (c == '+') ? 62
                    : (c == '/') ? 63
                    : -1;

            if (value != -1) {
                bits = (bits << 6) | value;
                bitCount += 6;

                if (bitCount >= 8) {
                    decodedBytes[outputIndex++] = (byte) (bits >> (bitCount - 8));
                    bitCount -= 8;
                }
            }
        }

        return new String(decodedBytes);
    }

}






