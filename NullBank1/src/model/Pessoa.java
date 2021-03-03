package model;

import java.util.Scanner;

public class Pessoa {

	private String nome;
	private String CPF;
	
	Scanner scan = new Scanner(System.in);
	
	
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + "]";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	
}
