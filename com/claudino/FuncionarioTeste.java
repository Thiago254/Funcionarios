package com.claudino;

import javax.swing.*;
import java.util.Scanner;

import static javafx.scene.input.KeyCode.T;
import static javax.swing.JOptionPane.*;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNomeFunc(JOptionPane.showInputDialog("Digite o nome: "));
        func.setDocumento(JOptionPane.showInputDialog("Digite seu Doc : "));
        func.setSalario(JOptionPane.showInputDialog("Digite seu salario"));
        func.setDepartamento(JOptionPane.showInputDialog("Digite seu Departamento"));
        func.setIdFunc(JOptionPane.showInputDialog("Digite seu ID"));
        func.setativo(JOptionPane.showInputDialog("Funcionario ativo?"));


        func.imprimir();
    }
}
