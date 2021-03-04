package model;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Pessoa cliente = new Pessoa();
		cliente.setNome("Gilberto");
		cliente.setCPF("6650654");
		
		
		Emprestimo em = new Emprestimo();
		ContaCorrente cc1 = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		cc1.setPessoa(cliente);
		cp1.setPessoa(cliente);
		em.setPessoa(cliente);
		cc1.abrirConta();
		cp1.abrirConta();
		cp1.bonus();
		
		
		em.emprestimo(cc1,5000, 12);
		cc1.exibirDados();
		cp1.exibirDados();
		
		
		
		
	
		
		
		
	

		
		


	}

}
