package org.example.exe1;

public class VALIDACAO {
    float validarNota(float nota1, float nota2, float nota3,float peso1,float peso2,float peso3){

        if (nota1 > 0 && nota1 <= 10 && nota2 > 0 && nota2 <= 10 && nota3 > 0 && nota3 <=10 && peso1 > 1 && peso1 <= 10 && peso2 > 1 && peso2 <=10 && peso3 > 1 && peso3 <=10 ){

            return 1;

        }
        return 0;

    }
}
