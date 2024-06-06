package org.example.exe1;

import java.util.Scanner;

public class EntradaSaida {

    public  void entradaSaida(){
        Scanner sc = new Scanner(System.in);
    try {
        float nota1,nota2,nota3,val,peso1,peso2,peso3;
        System.out.println("Insira abaixo  a sua 1 nota:");
        nota1 = sc.nextFloat();
        System.out.println("Insira abaixo a sua 2 nota:");
        nota2 = sc.nextFloat();
        System.out.println("Insira abaixo a sua 3 nota:");
        nota3 = sc.nextFloat();
        System.out.println("Insira os pesos respectivos as sua nota 1:");
        peso1 = sc.nextFloat();
        System.out.println("Insira os pesos respectivos as sua nota 2:");
        peso2 = sc.nextFloat();
        System.out.println("Insira os pesos respectivos as sua nota 3:");
        peso3 = sc.nextFloat();
        VALIDACAO validar = new VALIDACAO();

        val = validar.validarNota(nota1,nota2,nota3,peso1,peso2,peso3);
        if (val == 1){
            System.out.println("Notas validas...");
            System.out.println("Calculando a Media" );
            CALCULO calcular = new CALCULO();
            double media = calcular.calcMedia(nota1,nota2,nota3,peso1,peso2,peso3);
            RESULTADO result = new RESULTADO();
            System.out.println("Sua media é:"+media);
            result.resultado(media);
        }else {
            System.out.println("Notas invalidas");
        }

        }catch (Exception e){

            System.out.println("Dado invalido.");
        }

    }

}
