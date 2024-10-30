/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author LENOVO
 */
public class Bmi {

    double tinggi;
    double berat;

    public Bmi(double tinggi, double berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }

    public double bmiRumus() {
        return berat / (tinggi * tinggi);
    }

    public String tampilkanHasil() {
        double bmi = bmiRumus();
        if (bmi < 18.5) {
            return "Kurus";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Berat berlebih";
        } else {
            return "Obesitas";
        }
    }
}
