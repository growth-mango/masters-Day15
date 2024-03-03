public class ClockWiseDecoder extends Decoder{
    @Override
    String decode(Point startPoint, String[][] data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                sb.append(data[startPoint.getRow() + i / 2][startPoint.getColumn() - i % 2]);
            }
            if (i >= 4 && i < 6) {
                sb.append(data[startPoint.getRow() + 1][startPoint.getColumn() - (i - 2)]);
            }
            if (i >= 6) {
                sb.append(data[startPoint.getRow()][startPoint.getColumn() - (i - 4)]);
            }
        }
        return sb.toString();
    }
}
