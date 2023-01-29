import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Calculator<Integer> calculatorIntPl = new Calculator<>();
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = calculatorIntPl.add(a, b);
//        System.out.println(sum);
//
//        Calculator<Double> calculatorDbPl = new Calculator<>();
//        Scanner scanner1 = new Scanner(System.in);
//        double a1 = scanner1.nextDouble();
//        double b1 = scanner1.nextDouble();
//        double sum1 = calculatorDbPl.add(a1, b1);
//        System.out.println(sum1);
//        /////////"-"//////////
//        Calculator<Integer> calculatorIntMinus = new Calculator<>();
//        Scanner scanner2 = new Scanner(System.in);
//        int a2 = scanner2.nextInt();
//        int b2 = scanner2.nextInt();
//        int sum2 = calculatorIntMinus.minus(a2, b2);
//        System.out.println(sum2);
//
//        Calculator<Double> calculatorDbMinus = new Calculator<>();
//        Scanner scanner3 = new Scanner(System.in);
//        double a3 = scanner3.nextDouble();
//        double b3 = scanner3.nextDouble();
//        double sum3 = calculatorDbMinus.minus(a3, b3);
//        System.out.println(sum3);




        Calculator <Integer> calculatorInt = new Calculator<>();
        int sum;
        sum = calculatorInt.add(5, 7);
        System.out.println(sum);

        Calculator <Double> calculatordbPl = new Calculator<>();
        double sum1;
        sum1 = calculatordbPl.add(5.4,6.7);
        System.out.println(sum1);

        //"-"//
        Calculator <Integer> calculatorIntMinus = new Calculator<>();
        int sum2;
        sum2 = calculatorInt.minus(9, 4);
        System.out.println(sum2);

        Calculator <Double> calculatorDbMinus = new Calculator<>();
        double sum3;
        sum3 = calculatorDbMinus.minus(9.3, 4.0);
        System.out.println(sum3);


    }

}