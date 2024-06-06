package org.example.exe2;

public class IRPF {

    double desconto_irpf(double salarioBruto){
        double desconto  = salarioBruto * 0.10;
        salarioBruto = salarioBruto - desconto;
        return salarioBruto ;

    }
}
