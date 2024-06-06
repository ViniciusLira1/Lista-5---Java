package org.example.exe2;

import java.util.Scanner;

public class LIQUIDO {
    Scanner sc = new Scanner(System.in);

    double salario_liquido(double salarioBruto) {
        double desconto_inss = salarioBruto * 0.20;
        double desconto_irpf = salarioBruto * 0.10;
        double desconto_saude = salarioBruto * 0.05;
        String option = null;
        System.out.println("Foi realizada horas extras (sim ou não) ?");
        option = sc.nextLine();

        try {
            if (option.equals("sim")) {
                int horas_extras;
                System.out.println("Insira quantas horas extras foram feitas:");
                horas_extras = sc.nextInt();
                double PrecosalarioHora = salarioBruto / 160;
                double acrescimo = PrecosalarioHora * 0.5;
                double AcrescimoHoraExtra = horas_extras * (PrecosalarioHora * acrescimo);
                double salario = salarioBruto - desconto_inss - desconto_irpf - desconto_saude + AcrescimoHoraExtra;
                return salario;
            }
            return salarioBruto - desconto_inss - desconto_irpf - desconto_saude;
        } catch (Exception e) {
            System.out.println("Dado invalido.");
            return 0;
        }


    }
}