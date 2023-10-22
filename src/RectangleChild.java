public class RectangleChild extends Shape{
    public void area( int lenght, int width){
        int area = lenght * width;
        System.out.println(area);
    }
    public void perimeter ( int lenght, int width){
        int perimeter = 2 *(lenght * width);
        System.out.println(perimeter);
    }
}
