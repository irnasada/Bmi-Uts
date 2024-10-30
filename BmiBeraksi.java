/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BmiBeraksi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan anda : ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan berat badan anda : ");
        double berat = input.nextDouble();
        Bmi bmi = new Bmi(tinggi, berat);
        System.out.printf("Bmi anda adalah : %.1f%n", bmi.bmiRumus());
        System.out.println("Status anda adalah : " + bmi.tampilkanHasil());
    }
}
