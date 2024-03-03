public class EndDecoder extends Decoder{
    @Override
    String decode(Point startPoint, String[][] data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(data[startPoint.getRow() + i % 2][startPoint.getColumn() - i / 2]);
        }
        return sb.toString();
    }
}
