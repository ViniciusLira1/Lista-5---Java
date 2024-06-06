package org.example.exe2;

public class SAUDE {
    double desconto_saude(double salarioBruto){
        double desconto  = salarioBruto * 0.05;
        salarioBruto = salarioBruto - desconto;
        return salarioBruto ;

    }
}
