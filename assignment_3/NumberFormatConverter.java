package assignment3;


public class NumberFormatConverter {
    public static void main(String[] args) {
        String dec = bin2Dec("000001000");
        System.out.println(isValidBinString("00000"));
        System.out.println(binCharToDecimal('1'));
        System.out.println(dec);
    }

    public static String hex2Dec(String hexString) {
        long decimal = 0;
        if (!isValidHexString(hexString)) {
            throw new NumberFormatException("invalid hex format");
        }
        else {
            int len = hexString.length();
            for (int i = 0; i < len; i++) {
                decimal = decimal * 16 + hexCharToDecimal(hexString.charAt(i));
            }
        }
        String result = String.valueOf(decimal);
        return result;
    }

    public static boolean isValidHexString(String hexString) {
        for (int i = 0; i < hexString.length(); i++) {
            char c = hexString.charAt(i);
            if (!((c >= '0' && c <= '9') ||
                    (c >= 'a' && c <= 'f') ||
                    (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= '0' && ch <= '9') {
            return (ch - '0');
        }
        else if (ch >= 'a' && ch <= 'f') {
            return (ch - 'a' + 10);
        }
        else {
            return (ch - 'A' + 10);
        }
    }

    public static String bin2Dec(String binString) {
        long decimal = 0;
        if (!isValidBinString(binString)) {
            throw new NumberFormatException("invalid hex format");
        }
        else {
            int len = binString.length();
            for (int i = 0; i < len; i++) {
                decimal = decimal * 2 + binCharToDecimal(binString.charAt(i));
            }
        }
        String result = String.valueOf(decimal);
        return result;
    }

    public static boolean isValidBinString(String binString) {
        for (int i = 0; i < binString.length(); i++) {
            char c = binString.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static int binCharToDecimal(char ch) {
        if (ch == '0' || ch == '1') {
            return ch - '0';
        }
        throw new IllegalArgumentException("expected \'0\' or \'1\'");
    }
}
