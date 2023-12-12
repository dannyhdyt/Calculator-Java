package javaprogram;
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Operator operator = new Operator();
        Scanner inputNilai = new Scanner(System.in);

        boolean isThisTrue = true;
        while (isThisTrue) {
            System.out.println(" -KALKULATOR SEDERHANA- ");

            System.out.print("Input Nilai Pertama: ");
            int nilai1 = inputNilai.nextInt();
            System.out.print("Input Nilai Kedua: ");
            int nilai2 = inputNilai.nextInt();
            System.out.print("Pilih Operasi ( + , - , x , / ): ");
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
                    System.out.println("Operasi tidak tersedia silahkan diulang");
                    continue;
            }
            if (isThisTrue) {
                System.out.println("Hasil: " + result);
                break;
            }
        }
    }
}
