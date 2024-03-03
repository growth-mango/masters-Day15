import java.util.HashMap;
import java.util.Map;

public class MyASCII {
    private static Map<Integer, String> asciiCodes = new HashMap<>();

    public static String getAscii(String value) {
        setAsciiCodes();
        return asciiCodes.get(Integer.parseInt(value));
    }

    private static void setAsciiCodes() {
        for (int i = 0; i < 10; i++) {
            asciiCodes.put(i, String.valueOf(i));
        }
        for (int i = 10; i <= 35; i++) {
            asciiCodes.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        asciiCodes.put(36, "Space");
        asciiCodes.put(37, "$");
        asciiCodes.put(38, "%");
        asciiCodes.put(39, "*");
        asciiCodes.put(40, "+");
        asciiCodes.put(41, "-");
        asciiCodes.put(42, ".");
        asciiCodes.put(43, "/");
        asciiCodes.put(44, ":");
    }
}
