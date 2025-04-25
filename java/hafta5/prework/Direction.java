package hafta5.prework;

public enum Direction {
    WEST(90),
    NORTH(180),
    EAST(0),
    SOUTH(82);

    private final int angle;

    Direction(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }
}