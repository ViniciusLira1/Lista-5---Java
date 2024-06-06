package org.example.exe2;

public class HORAS_EXTRAS {

    double acrescimo_horas_extras(double salarioBruto,int horasExtras){
        double salarioHora = salarioBruto/160;
        double acrescimo = salarioHora * 0.5;
        double salario = salarioBruto + (horasExtras * (salarioHora * acrescimo));
        return salario;

    }
}
