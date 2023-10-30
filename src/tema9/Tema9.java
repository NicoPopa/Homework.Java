package tema9;

import tema9.Godzila;
import tema9.Monster;

public class Tema9 {
    public static void main(String[] args) {

        Yeti yeti = new Yeti();
        Godzila godzila = new Godzila();
        Monster[] monsters = {yeti, godzila};
        for (Monster monstrulMeu : monsters){
            if ( monstrulMeu instanceof Yeti miculYeti){
                miculYeti.attack();
            }
            else if ( monstrulMeu instanceof Godzila miculGodzila){
                miculGodzila.attack();
            }
            Circle circle = new Circle();
            Rectangle rectangle= new Rectangle();
            circle.getArea();
            circle.getPerimeter();
            rectangle.getArea();
            rectangle.getPerimeter();
            circle.toString();
            rectangle.toString();
        }
    }
}
