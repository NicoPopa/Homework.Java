import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

//public class Tema3
//{
//    public static void main(String[] args) {
//
//////Ex 1
//
//        for (int a = 1; a <= 10; a++) {
//            System.out.println(a);
//        }
//
//        // Ex2
//
//        int sum = 0;
//        for (int a = 1; a <= 10; a++) {
//            sum = sum + a;
//
//        }
//
//        System.out.println(sum);
//
//        //Ex 3
//
//
//        Scanner factorial = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int b = factorial.nextInt();
//        int prod = 1;
//
//        for (int a = 1; a <= b; a++) {
//            prod = prod * a;
//
//            System.out.println(prod);
//        }
//        //Ex4
//        int sum_even = 0;
//        int sum_odd = 0;
//        for (int x = 1; x <= 10; x++) {
//            if (x % 2 == 0) {
//                sum_even += x;
//            } else {
//                sum_odd += x;
//            }
//        }
//
//        System.out.println("suma pare: " + sum_even);
//        System.out.println("suma impare: " + sum_odd);
//
//        //Ex 5
//
//        for (int i = 1; i <= 10; i++) {
//            for (int m = 1; m <= 10; m++)
//
//                System.out.println(i * m);
//        }
//
//// Ex 6
//        Scanner patrat = new Scanner(System.in);
//        System.out.print("Ce numar vrei sa ridici la o putere ?: ");
//        int numar_de_ridicat = patrat.nextInt();
//        System.out.print("La ce putere vrei sa-l ridici ?: ");
//        int putere = patrat.nextInt();
//        int rezultat = 1;
//        for (int i = 1; i <= putere; i++) {
//            rezultat = rezultat * numar_de_ridicat;
//
//        }
//        System.out.println(rezultat);
//
////        //Ex 7
//        int n = 5;
//        for (int rand = 1; rand <= n; rand++) {
//            for (int coloana = 1; coloana <= rand; coloana++) {
//
//                System.out.print(coloana);
//                if (coloana == rand) {
//                    System.out.println();
//                }
//
//
//            }
//        }
//
//
//        //Ex 8
//        int oddnumber = 0;
//        int prod_odd = 1;
//        int numeredeinmultit = 5;
//        int numarinitial = 1;
//
//        while (oddnumber < numeredeinmultit) {
//            if (numarinitial % 2 == 1) {
//                prod_odd *= numarinitial;
//                oddnumber++;
//                numarinitial++;
//                continue;
//            }
//            numarinitial++;
//        }
//        System.out.println("produsul imparelor este:" + prod_odd);
//
//        //Ex 9
//        n = 4;
//        for (int rand = 1; rand <= n; rand++) {
//            for (int coloana = 1; coloana <= rand; coloana++) {
//
//                System.out.print(rand);
//                if (coloana == rand) {
//                    System.out.println();
//                }
//
//            }
//        }
//
//        // EX 10
//
//        int numeredegasit = 5;
//        int numeregasite = 0;
//        int numarCurent = 1;
//        sum = 0;
//        while (numeregasite < numeredegasit) {
//            sum += numarCurent * numarCurent;
//            System.out.println("Numarul curent este" + numarCurent + "iar suma este" + sum);
//            numarCurent++;
//            numeregasite++;
//
//        }
//        System.out.println(" suma primelor " + numeregasite + " patrate perfecte este" + sum);
//
//
//        //Ex 11
//        Scanner numarperfect = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int sumaperfecta;
//         int numar = numarperfect.nextInt();
//         sum = 0;
//
//             for (int i = 1; i < numar;  i++) {
//                if (numar % i == 0) {
//                    sum += i;
//                }
//
//             }
//        if (sum == numar) {
//
//            System.out.println(" este numar perfect si suma e " + sum);
//        } else {
//            System.out.println(" nu este numar perfect si suma e " + sum);
//        }
//
////        //Ex 12
//        int limitaminima = 1;
//        int limitamaxima = 8300;
//
//        for (int numarpecareilverificam = limitaminima; numarpecareilverificam < limitamaxima; numarpecareilverificam++) {
//            sum = 0;
//            for (int i = 1; i < numarpecareilverificam; i++) {
//                if (numarpecareilverificam % i == 0) {
//                    sum += i;
//                }
//
//            }
//            if (sum == numarpecareilverificam) {
//
//                System.out.println("i cu suma " + sum);
//            }
//        }
////
////        ///Ex 13
//        Scanner Serie = new Scanner(System.in);
//        System.out.println(" Please enter an integer: ");
//        int f = Serie.nextInt();
//        sum = 0;
//        int ultimul = -1;
//        int penultimul  = -1;
//        numeregasite = 0;
//        numeredegasit = 10;
//        int numarcurent = 0;
//        while (numeregasite < numeredegasit) {
//            if ((ultimul == - 1) && (penultimul == -1))
//            {
//                numarcurent = 0;
//                ultimul = 0;
//            } else if ( (ultimul == 0) && ( penultimul == -1)) {
//                numarcurent = 1;
//                ultimul = 1;
//                penultimul = 0;
//
//            } else {
//
//                numarcurent = ultimul + penultimul;
//                penultimul = ultimul;
//                ultimul = numarcurent;
//
//
//            }
//
//            numeregasite++;
//
//
//            System.out.println( " penultimul " + penultimul + " ultimul " + ultimul + " numarcurent " + numarcurent);
//
//            }
//    }}
//
//
//
