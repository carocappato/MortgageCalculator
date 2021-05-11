package com.company;

import java.text.NumberFormat;
import java.util.Scanner;


/*
* Preguntar: principal
* tasa de interés anual
* por cuantos años
/
 */
public class Main {

    public static void main(String[] args) {
        final byte MESES = 12;
        final byte PORCENTAJE = 100;
        Scanner scanner = new Scanner(System.in);
        float tasaDeInteresAnual, tasaDeInteresMensual;
        int anios, mesesTotales;
        double deudaACalcular, deudaCalculada;


        System.out.print("Deuda adquirida: ");
        deudaACalcular = scanner.nextInt();

        System.out.print("Tasa de interes (anual): ");
        tasaDeInteresAnual = scanner.nextFloat();
        tasaDeInteresMensual = tasaDeInteresAnual / PORCENTAJE / MESES;

        System.out.print("Cantidad de años: ");
        anios = scanner.nextInt();
        mesesTotales = anios * MESES;
        deudaCalculada = deudaACalcular * (tasaDeInteresMensual * Math.pow(1 + tasaDeInteresMensual, mesesTotales))/ (Math.pow(1 + tasaDeInteresMensual, mesesTotales)- 1);

        String casteoAMonedaLocal = NumberFormat.getCurrencyInstance().format(deudaCalculada);


        System.out.println("Valor de las cuotas: " + casteoAMonedaLocal);






    }
}
