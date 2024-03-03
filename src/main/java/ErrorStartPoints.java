import java.nio.channels.Pipe;

public enum ErrorStartPoints {
    ERROR1(new Point(12,8), new UpStraightDecoder()),
    ERROR2(new Point(9,5), new DownStraightDecoder()),
    ERROR3(new Point(12,3), new UpStraightDecoder()),
    ERROR4(new Point(9,1), new DownStraightDecoder());

    private Point startPoint;
    private Decoder decoder;

    // 생성 시점에 인자 받게 처리하기
    ErrorStartPoints(Point startPoint, Decoder decoder) {
        this.startPoint = startPoint;
        this.decoder = decoder;
    }

    public String calculate(String[][] data){
        return this.decoder.decode(startPoint, data);
    }
}
