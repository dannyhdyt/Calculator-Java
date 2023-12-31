package javaprogram;

import java.util.Scanner;
import com.sun.source.tree.WhileLoopTree;


public class Calculator {
    public static void main(String[] args) {

        Operator operator = new Operator();
        Scanner inputNilai = new Scanner(System.in);

        boolean isThisTrue = true;
        while (isThisTrue) {
            System.out.println(" \n-Welcome to Simple Calculator-Java!- \n");

            System.out.print("Enter first number: ");
            int nilai1 = inputNilai.nextInt();
            System.out.print("Enter second number: ");
            int nilai2 = inputNilai.nextInt();
            System.out.print(
                "Choose an operation: [ + , - , x , / ] \n"+
                "Enter operation choice: ");
            String pemilihan = inputNilai.next();

            int result = 0;
            switch (pemilihan) {
                case "+":
                    result = operator.penjumlahan(nilai1, nilai2);
                    break;
                case "-":
                    result = operator.pengurangan(nilai1, nilai2);
                    break;
                case "x":
                    result = operator.perkalian(nilai1, nilai2);
                    break;
                case "/":
                    result = operator.pembagian(nilai1, nilai2);
                    break;
                default:
                    System.out.println("Operation not available please repeat");
                    continue;
            }
            if (isThisTrue) {
                System.out.println("Result: " + nilai1 +" "+ pemilihan +" "+ nilai2 +" "+"= "+ result + "\n");
                break;
            }
        }
    }
}
