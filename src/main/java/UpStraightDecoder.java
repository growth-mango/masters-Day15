public class UpStraightDecoder extends Decoder {
    @Override
    String decode(Point startPoint, String[][] data) { // 시작 좌표랑, 사용자 입력값이 매개변수
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(data[startPoint.getRow() - i / 2][startPoint.getColumn() - i % 2]);
        }
        return sb.toString();
    }
}
