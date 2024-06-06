package org.example.exe2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean validar = true;
        while (validar == true) {
            try {
                double salarioBruto;
                System.out.println("Insira seu salario bruto");
                salarioBruto = sc.nextDouble();
                int option, hrExtra;

                System.out.println("Escolha uma das seguintes opcoes:\n" +
                        "1- salario liquido\n" +
                        "2- Desconto INSS\n" +
                        "3- Desconto IRPF\n" +
                        "4- Desconto Saude\n" +
                        "5- Salario com Horas Extras ");

                option = sc.nextInt();

                switch (option) {
                    case 1: {
                        LIQUIDO salario = new LIQUIDO();
                        System.out.println(salario.salario_liquido(salarioBruto));
                        break;
                    }
                    case 2: {
                        INSS inss = new INSS();
                        System.out.println(inss.desconto_inss(salarioBruto));
                        break;
                    }
                    case 3: {

                        IRPF irpf = new IRPF();
                        System.out.println(irpf.desconto_irpf(salarioBruto));
                        break;
                    }
                    case 4: {
                        SAUDE saude = new SAUDE();
                        System.out.println(saude.desconto_saude(salarioBruto));
                        break;
                    }
                    case 5: {
                        HORAS_EXTRAS horasEXTRAS = new HORAS_EXTRAS();
                        System.out.println("Insira a quantidade de horas extras trabalhadas:");
                        hrExtra = sc.nextInt();
                        System.out.println("Seu salario com as horas extras são:" + horasEXTRAS.acrescimo_horas_extras(salarioBruto, hrExtra));

                        break;
                    }
                    default:
                        System.out.println("Encerrando o programa");
                        validar = false;
                }

            }catch (Exception e){
                System.out.println("Dado invalido, finalizando o programa....");
                validar = false;
            }


        }
    }
}

