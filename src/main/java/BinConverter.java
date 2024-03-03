public class BinConverter {

    // 2진수 -> 10진수 (데이터)
    public static String convertToDec(String binaryString) {
        int decimalNumber = Integer.parseInt(binaryString, 2);
        return String.valueOf(decimalNumber);
    }

    // 2진수 -> 16진수 (에러코드)
    public static String convertToHex(String binaryString) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += (int) (Math.pow(2, 3 - i) * Integer.parseInt(String.valueOf(binaryString.charAt(i))));
        }
        return Integer.toHexString(sum).toUpperCase() + "0";
    }
}

