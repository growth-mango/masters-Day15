public class Point {
    private int row;
    private int column;

    public Point(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    // 두 객체의 참조가 같은지 확인 (메모리 상에서 같은 위치를 가리키고 있는지 확인)
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        // 매개변수로 전달된 obj 가 null 이 아니고
        // Point 클래스의 인스턴스이며
        // Point 객체의 row와 column 필드가 현재 객체의 row와 column 필드와 같을 경우
        // true 반환, 그렇지 않으면 false
        Point point = (Point) obj;
        return row == point.row && column == point.column;
    }

    @Override
    // 객체를 문자열 표현으로 변환하는 데 사용
    public String toString(){
        return row + ", " + column;
    }
}
