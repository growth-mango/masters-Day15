public enum DataStartPoints {
    DATA1(new Point(14, 20), new UpStraightDecoder()),
    DATA2(new Point(10, 20), new CounterClockWiseDecoder()),
    DATA3(new Point(11, 18), new DownStraightDecoder()),
    DATA4(new Point(15, 18), new DownStraightDecoder()),
    DATA5(new Point(19, 18), new ClockWiseDecoder()),
    DATA6(new Point(18, 16), new UpStraightDecoder()),
    DATA7(new Point(14, 16), new UpStraightDecoder()),
    DATA8(new Point(10, 16), new CounterClockWiseDecoder()),
    DATA9(new Point(11, 14
    ), new DownStraightDecoder()),
    DATA10(new Point(15, 14), new DownStraightDecoder()),
    DATA11(new Point(18, 14), new ClockWiseDecoder()),
    DATA12(new Point(18, 12), new UpStraightDecoder()),
    DATA13(new Point(14, 12), new UpStraightDecoder()),
    DATA14(new Point(10, 12), new UpStraightDecoder()),
    DATA15(new Point(5, 12
    ), new UpStraightDecoder()),
    DATA16(new Point(1, 12), new CounterClockWiseDecoder()),
    DATA17(new Point(2, 10), new DownStraightDecoder()),
    DATA18(new Point(7, 10), new DownStraightDecoder()),
    DATA19(new Point(11, 10), new DownStraightDecoder()),
    DATA20(new Point(15, 10), new DownStraightDecoder());

    private Point startPoint;
    private Decoder decoder;

    DataStartPoints(Point startPoint, Decoder decoder) {
        this.startPoint = startPoint;
        this.decoder = decoder;
    }

    public String calculate(String[][] data) {
        return this.decoder.decode(startPoint, data);
    }
}
