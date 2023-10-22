public class CircleChild extends Shape{

    public void area( int pi, int r){
        int area = pi * r * r;
        System.out.println(area);
    }
    public void perimeter (int pi, int r){
        int perimeter = 2 * pi * r;
        System.out.println(perimeter);

    }
}
