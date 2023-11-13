package temaSession13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box <T> {
    //1. Define a generic class called Box that can hold an object of any type. Implement methods to set and get the value inside the box.
    Box myBox = new Box();

    public Box getMyBox() {
        return myBox;
    }

    public void setMyBox(Box myBox) {
        this.myBox = myBox;
    }
    //2. Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order (pass different types).
    public static<T> boolean arrayMethod ( ArrayList <T> myArray,ArrayList <T> mySecondArray){

        for ( int i = 0; i < myArray.size(); i++){
           // myArray.get(i).getClass();
          //  mySecondArray.get(i);
            if (!Objects.equals(myArray.get(i), mySecondArray.get(i))){
                System.out.println("Am returnat false");
              return false;
            }
        }
        System.out.println("Am returnat true");
            return true;

    }
}
