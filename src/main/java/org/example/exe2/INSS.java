package org.example.exe2;

public class INSS {

    double desconto_inss(double salarioBruto){
       double desconto  = salarioBruto * 0.20;
       salarioBruto = salarioBruto - desconto;
       return salarioBruto ;

    }
}
