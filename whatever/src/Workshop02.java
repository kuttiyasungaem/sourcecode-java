
class Space3D {
    private static final int exponent_two = 2;

    double cal(Point3D startPoint, Point3D endPoint) {
        double x = Math.pow((startPoint.x - endPoint.x), exponent_two);
        double y = Math.pow((startPoint.y - endPoint.y), exponent_two);
        double z = Math.pow((startPoint.z - endPoint.z), exponent_two);

        double distance = Math.sqrt(x + y + z);
        return distance;
    }
}

class Point3D {

    public Point3D(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    int x;
    int y;
    int z;
}

public class Workshop02 {

    public static void main(String[] args) {

        Space3D space3D = new Space3D();
        Point3D startPoint = new Point3D(2, 1, 3);
        Point3D endPoint = new Point3D(2, 1, 3);
        double distance = space3D.cal(startPoint, endPoint);

        System.out.println(distance);

    }

}
