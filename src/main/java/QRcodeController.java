import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QRcodeController {
    private Decoder decoder;

    public void run(String[][] data) {
        List<String> results = new ArrayList<>();

        results.add(getData(data));
        results.add(getError(data));
        System.out.println(results.toString());
    }

    private String getData(String[][] data) {
        if (startValidate(new Point(20, 20), data) && endValidate(new Point(19, 10), data)) { // 시작과 끝 조건이 맞으면
            int length = getLength(new Point(18, 20), data);
            String result = Arrays.stream(DataStartPoints.values())
                    .map(startPoint -> startPoint.calculate(data))
                    .map(BinConverter::convertToDec) // 10진수로
                    .map(MyASCII::getAscii) // 코드에서 찾기
                    .reduce("", (a, b) -> a + b);
            return (result.substring(0, length)); // 길이만큼만
        }
        return "";
    }

    private String getError(String[][] data) { // 에러는 16진수로 변환된 값이 출력되면 됨
        String result = Arrays.stream(ErrorStartPoints.values())
                .map(startPoint -> startPoint.calculate(data))
                .map(BinConverter::convertToHex)
                .reduce("", (a, b) -> a + b);
        return "0x" + result;
    }

    private boolean startValidate(Point startPoint, String[][] data) {
        decoder = new StartDecoder();
        return decoder.decode(startPoint, data).equals("1100");
    }

    private boolean endValidate(Point startPoint, String[][] data) {
        decoder = new EndDecoder();
        return decoder.decode(startPoint, data).equals("0110");
    }

    private int getLength(Point startPoint, String[][] data) {
        decoder = new UpStraightDecoder();
        return Integer.parseInt(decoder.decode(startPoint, data), 2);
    }
}
