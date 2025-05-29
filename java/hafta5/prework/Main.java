package hafta5.prework;

public class Main {
    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day);
        }

        System.out.println(Direction.NORTH.name());
        System.out.println(Direction.NORTH.getAngle());
        System.out.println(Direction.NORTH.ordinal());


        System.out.println(Operation.ADD.apply(1, 2));

        Point point = new Point(2, 2);
        System.out.println(point);
    }
}