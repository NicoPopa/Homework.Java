package Tema12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class todayDate {
    //1. Write a method named displayTodaysDate that, when called, prints the current date to the console.
    public static void displayTodayDate(){

        LocalDate today = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatedDate = today.format(dateTimeFormatter);
        System.out.println(" Today date is: "+ formatedDate);
    }

    //2. Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately (date in the format YYYY-MM-DD).
public static void displayDateComponents() {
    LocalDate today = LocalDate.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd");
    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MM");
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy");
    String day = today.format(dateTimeFormatter);
    String month = today.format(dateTimeFormatter1);
    String year = today.format(dateTimeFormatter2);
    System.out.println(" Today is formed from the day: "+ day + " and also from month: " + month + " and also from year: "+ year);
}
//3. Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise (format YYYY-MM-DD).
    public static void areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" First date is: ");
        String today = scanner.next();
        LocalDate primaData = LocalDate.parse(today);
        System.out.println(" The second date is: ");
        String anotherDay = scanner.next();
        LocalDate aDouaData = LocalDate.parse(anotherDay);
        int valoareComparata = primaData.compareTo(aDouaData);
        System.out.println(" Raspunsul comparatiei este: "+ valoareComparata);
        if (valoareComparata == 0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        }
    }

