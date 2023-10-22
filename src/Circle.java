public class Circle {
    ///Ex 2
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public static void calculateArea( int radius){
        float pi = 3.14f;
        float area = pi*radius*radius;
        System.out.println(area);
    }
    public static void calculatePerimeter( int radius) {
        float pi = 3.14f;
        float perimeter = 2*pi*radius;
        System.out.println(perimeter);
    }
}
