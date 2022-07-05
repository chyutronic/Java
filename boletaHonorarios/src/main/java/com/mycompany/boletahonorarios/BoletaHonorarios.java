/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boletahonorarios;

import javax.swing.JOptionPane;

/**
 *
 * @author chyut
 */
public class BoletaHonorarios {

    public static void main(String[] args) {
        String ano = JOptionPane.showInputDialog("Introduce el ano: ");
        String tipoBoleta = JOptionPane.showInputDialog("Vas a introducir un valor liquido(l) o bruto(b)..?: ");    

        double retencion2022 = 12.25;
        int retencion2023 = 13;
        double retencion2024 = 13.75;
        double retencion2025 = 14.5;
        double retencion2026 = 15.25;
        int retencion2027 = 16;
        int retencion2028 = 17;
        
        if ("l".equals(tipoBoleta)){
            String strLiquido = JOptionPane.showInputDialog("Introduce el valor liquido: ");
            double liquido = Double.parseDouble(strLiquido);
            double valorBruto;
            if (null == ano){
                valorBruto = (int) ((liquido * 100)/(100 - retencion2028));               
            }
            else valorBruto = switch (ano) {
                case "2022" -> (liquido * 100)/(100 - retencion2022);
                case "2023" -> (liquido * 100)/(100 - retencion2023);
                case "2024" -> (liquido * 100)/(100 - retencion2024);
                case "2025" -> (liquido * 100)/(100 - retencion2025);
                case "2026" -> (liquido * 100)/(100 - retencion2026);
                case "2027" -> (liquido * 100)/(100 - retencion2027);
                case "2028" -> (liquido * 100)/(100 - retencion2028);
                default -> (liquido * 100)/(100 - retencion2028);
            };
            JOptionPane.showMessageDialog(null, "El valor bruto de la Boleta es: $" + valorBruto);
            System.out.print("El valor bruto de la Boleta es: ");
            System.out.printf("%1.2f", valorBruto);
        }
        
        if ("b".equals(tipoBoleta)){
            String strBruto = JOptionPane.showInputDialog("Introduce el valor bruto: ");
            double bruto = Double.parseDouble(strBruto);
            double valorLiquido;
            if (null == ano){
                valorLiquido = (int) ((bruto * (100 - retencion2028)) / 100);               
            }
            else valorLiquido = switch (ano) {
                case "2022" -> ((bruto * (100 - retencion2022)) / 100);
                case "2023" -> ((bruto * (100 - retencion2023)) / 100);
                case "2024" -> ((bruto * (100 - retencion2024)) / 100);
                case "2025" -> ((bruto * (100 - retencion2025)) / 100);
                case "2026" -> ((bruto * (100 - retencion2026)) / 100);
                case "2027" -> ((bruto * (100 - retencion2027)) / 100);
                case "2028" -> ((bruto * (100 - retencion2028)) / 100);
                default -> ((bruto * (100 - retencion2028)) / 100);
            };
            JOptionPane.showMessageDialog(null, "El valor liquido de la Boleta es: $" + valorLiquido);
            System.out.print("El valor liquido de la Boleta es: ");
            System.out.printf("%1.2f", valorLiquido);
        }       
        
    }
}


