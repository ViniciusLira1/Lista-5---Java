package org.example.exe3;

public class EMPRESTIMO {
    public void  calc_emprestimo(double salarioAtual,double valorEmprestimo){
        if (valorEmprestimo <=200000) {
            valorEmprestimo = valorEmprestimo + (valorEmprestimo * 0.35);
            double parcelaEmprestimo = valorEmprestimo / 24;

            if (parcelaEmprestimo <= salarioAtual * 0.15) {
                System.out.println("Emprestimo aprovado valor total a ser pago :" + valorEmprestimo);
                System.out.println("Valor das parcelas em 24X: " + parcelaEmprestimo);


            }
            else {
                System.out.println("Valor nao aprovado.");
            }

        }
        else {
            System.out.println("Valor de Emprestimo nao aprovado");
        }


    }
}
