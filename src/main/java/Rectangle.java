public class Rectangle {
    public static final double MIN_X = 1;
    public static final double MAX_X = 5;
    public static final double MIN_Y = -2;
    public static final double MAX_Y = 7;
    public boolean isBelongRectangle(double x, double y) {
        if (x >= 2 && x <= 3.5) {
            if (y >= 0 && y <= 5) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
