package Tema11;

import java.util.*;

public class exercitiiT11 {
    //1. Write a Java program to iterate through all elements in a array list.
    public static void ruleazaExT11() {
        List<Integer> nrCarti = new ArrayList<>();
        nrCarti.add(5);
        nrCarti.add(2);
        nrCarti.add(1);
        for (Integer carte : nrCarti) {
            System.out.println(carte);
        }
        System.out.println("===ex1");
    }

    public static void getElemente() {
        //  2. Write a Java program to insert an element into the array list at the first position.
        ArrayList<Integer> nrElemente = new ArrayList<>();
        nrElemente.add(2);
        nrElemente.add(3);
        nrElemente.add(5);
            nrElemente.add(0, 1);
            System.out.println(nrElemente.get(0));
            System.out.println("===ex2");
        }
        //3. Write a Java program to sort a given array list.
    public static void sortArray (){
        ArrayList<Integer> nume = new ArrayList<>();
        nume.add(2);
        nume.add(5);
        nume.add(10);
        nume.add(1);
        Collections.sort(nume);
        System.out.println("===ex3");
        System.out.println(nume);
    }

    ///4. Write a Java program to copy one array list into another.
    public static void copyArrayList(){
        ArrayList<Integer> firstArray = new ArrayList<>();
        firstArray.add(1);
        firstArray.add(2);
        firstArray.add(3);
        firstArray.add(4);

        ArrayList<Integer> secondArray = new ArrayList<>();
        for(Integer valoare: firstArray){
            secondArray.add(valoare);
        }
        System.out.println("===ex4");
        System.out.println(" firstArray este " + firstArray);
        System.out.println(" secondArray este " + secondArray);
    }
    //5. Write a Java program of swap two elements in an array list.
    public static void swapElements(){
        ArrayList lista = new ArrayList<>();
        lista.add(15);
        lista.add(27);
        lista.add(30);
        lista.add(11);
      lista.set(1, 21);
      lista.set(3, 18);
        System.out.println("====ex5");
        System.out.println(" lista are valorile " + lista);
    }

   // 6. Write a Java program to trim the capacity of an array list the current list size.
    public static void trimList (){
        ArrayList<Integer> listaNoua = new ArrayList<>(5);
        listaNoua.add(3);
        listaNoua.add(2);
        listaNoua.add(7);
        listaNoua.trimToSize();
        System.out.println("===ex 6");
        for (Integer nr: listaNoua){
            System.out.println(" lista cu noile elemente este: " + listaNoua);
        }
    }
//7. Write a Java program to empty an array list.
    public static void emptyList(){
        ArrayList<Integer> listaDeGolit = new ArrayList<>();
        listaDeGolit.add(4);
        listaDeGolit.add(16);
        listaDeGolit.add(8);
        listaDeGolit.add(13);
        listaDeGolit.clear();

        System.out.println(" lista de golit este goala " + listaDeGolit.isEmpty());
        System.out.println("=== ex 7");
        System.out.println(listaDeGolit);
    }
    ///8. Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void linkeList(){
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        System.out.println("=== ex 8");
        for ( int i = 1; i < myList.size(); i++){
            System.out.println(" momentan sunt la elementul de index " + i + " cu valoarea "+ myList.get(i));
        }
    }
    //9. Write a Java program to iterate a linked list in reverse order.
    public static void reverseOrder(){
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(10);
        myList.add(9);
        myList.add(8);
        myList.add(7);
        System.out.println(" === ex 9");
        for (int i = myList.size()-1; i >= 0; i--){
            System.out.println(myList.get(i));
        }

    }
    //10. Write a Java program to insert some elements at the specified position into a linked list.
    public static void insertElements(){
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(2);
        myList.add(7);
        myList.add(56);
        myList.add(45);
        System.out.println("=== ex 10");
       myList.add(1,7);
       myList.add(2,21);
       myList.add(3, 36);
        System.out.println(myList);
    }
    //11. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    public static void firstAndLast(){
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(3);
        myList.add(5);
        myList.add(18);
        myList.add(47);
        System.out.println("=== ex 11");
        for (int i = 0; i< myList.size()-1; i++){

        }
        System.out.println(myList.get(0));
        System.out.println(myList.get(myList.size()-1));
    }

    //12. Write a Java program to join two linked lists.
    public static void joinLimkedList(){
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(7);
        myList.add(3);
        myList.add(4);
        myList.add(9);

        LinkedList<Integer> mySecondList = new LinkedList<>();
        mySecondList.add(8);
        mySecondList.add(13);
        mySecondList.add(21);
        mySecondList.add(43);
        LinkedList<Integer> lastList = new LinkedList<>();
        lastList.addAll( 0,myList);
        lastList.addAll(lastList.size(),mySecondList);
        System.out.println("=== ex 12");
        System.out.println(lastList);

    }

    //13. Write a Java program to clone an linked list to another linked list.
    public static void cloneList(){
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(4);
        myList.add(8);
        myList.add(14);
        myList.add(48);
        LinkedList<Integer> secondList = new LinkedList<>();
        secondList = (LinkedList<Integer>) myList.clone();
        System.out.println(" === ex 13");
        System.out.println(" lista clonata este "+ secondList);
    }

    }
