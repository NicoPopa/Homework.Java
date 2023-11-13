package temaSession13;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList < Integer> myArray = new ArrayList<>(Arrays.asList(2,13,8,16));
        ArrayList <Integer> mySecondArray = new ArrayList<>(Arrays.asList(2,13,8,16));
        Box.arrayMethod(mySecondArray, myArray);

    }
}
