public class TriangleChild extends Shape {
    public void area(int b, int h) {
        int area = ( b * h )/2;
        System.out.println(area);
    }
     public void perimeter ( int l1, int l2, int l3){
        int perimeter = l1 + l2 + l3;
         System.out.println(perimeter);
     }
}
