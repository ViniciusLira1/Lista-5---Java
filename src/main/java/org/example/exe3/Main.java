package org.example.exe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EMPRESTIMO emp = new EMPRESTIMO();
        Scanner sc = new Scanner(System.in);
        Boolean validar = true;
        while (validar == true){
            try {
                double salario, emprestimo;
                int op;
                System.out.println("Insira seu salario atual");
                salario = sc.nextDouble();

                System.out.println("Insira o valor do emprestimo que deseja fazer:");
                emprestimo = sc.nextDouble();

                emp.calc_emprestimo(salario, emprestimo);

                System.out.println("Para finalizar o programa digite 1");
                op = sc.nextInt();
                if (op == 1) {
                    validar = false;
                    System.out.println("Encerrando o programa");
                }
            }
            catch (Exception e){
                System.out.println("Insira um dado valido");
                validar = false;
            }
        }
    }
}
