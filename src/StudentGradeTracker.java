import java.util.Scanner;
public class StudentGradeTracker {


public static void main (String[] args) {

        String[] Studenti = new String[]{"Andrei", "Maria", "Ioana"};
        String[] Materii = new String[]{"Romana", "Engleza", "Istorie", "Matematica", "Chimie"};

        int[][] Note = new int[][]{
        {3, 8, 10, 7, 5},
        {10, 8, 4, 7, 6},
        {9, 8, 5, 7, 10}
        };
        // 0,0 0,1 0,2 0,3 0,4
        // 1,0 1,1 1,2 1,2 1,4
        // 2,0 2,1 2,2 2,3 2,4

        printMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu codul aferent alegerii tale: ");
        int choice = scanner.nextInt();

        switch (choice) {
        case 1 -> {
        System.out.print("Introdu codul studentului: ");
        int idStudent = scanner.nextInt();

        printGradesForStudentWithId(idStudent, Materii, Note);
        }
        case 2 ->
        {
                System.out.println(" Studentul pentru care verificam notele de trecere: ");
                int idStudent = scanner.nextInt();
                printFailedGrades(idStudent, Materii, Note);
        }
        case 3 -> {
                int media = 0;
                int medieTemporara = 0;
                int numarMaterii = 5;
                System.out.println( "Id-ul studentului este: ");
                int idStudent = scanner.nextInt();
              int indexRand = 0;


                for ( int indexColoana = 0;  indexColoana <= 4; indexColoana++ )
                {
                        int noteDeVerificat = Note[idStudent][indexColoana];
                        medieTemporara += noteDeVerificat;

                }
                media = medieTemporara/numarMaterii;
                System.out.println("Media aritmetica a notelor studentului este: " + media);
        }

default -> System.out.println("Nu am aceasta comanda in meniu");
        }


        }

public static void printGradesForStudentWithId(int id, String[] Materii, int[][] Note) {
        System.out.println("Notele studentului sunt: ");
        for (int i = 0; i < Materii.length; i++) {
        System.out.println(Materii[i] + ": " + Note[id][i]);
        }
        }

public static void printMenu() {
        System.out.println("Meniu:");
        System.out.println("1. Afiseaza notele pentru studentul...");
        System.out.println("2. Verifica notele de trecere..");
        System.out.println("3. Media generala a studentului este...");
        }

        public static void printFailedGrades(int idStudent, String[] Materii, int[][] note)
        {
                System.out.println(" Notele sunt: ");
              for ( int indexColoana = 0;  indexColoana <= 4; indexColoana++ )
              {
                      int noteDeVerificat = note[idStudent][indexColoana];
                      System.out.println( note[idStudent][indexColoana]);
                      if ( noteDeVerificat < 5 ) {
                              System.out.println( noteDeVerificat +" nu este nota de trecere la materia " + Materii[indexColoana]);

                      }
              }

        }
        }
