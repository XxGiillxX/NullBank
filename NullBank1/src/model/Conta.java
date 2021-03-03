package model;
import java.util.Random;
import java.util.Scanner;
public abstract class Conta {
		
		private Pessoa pessoa;
		private int numero;
		private int agencia;
		private boolean contaAtiva = false;
		
		
		public abstract void depositar(double valor);
		public abstract void sacar(double valor);
		public abstract void transferir(Conta destino, double valor);
		public abstract void exibirDados();
		
		
		Random rand = new Random();
		
		

		void abrirConta() {
			if (contaAtiva == false) {
				this.contaAtiva = true;
				System.out.println("Conta aberta com sucesso");
			} else {
				System.out.println("Conta já existente");
			}

		}
	
		public int getNumero() {
			return rand.nextInt(9999);
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return rand.nextInt(99);
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public boolean getContaAtiva() {
			return contaAtiva;
		}

		public void setContaAtiva(boolean contaAtiva) {
			this.contaAtiva = contaAtiva;
		}

		public Pessoa getPessoa() {
		
			return pessoa;
		}
		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
		}
		@Override
		public String toString() {
			return "Conta [pessoa=" + pessoa + ", numero=" + numero + ", agencia=" + agencia + ", contaAtiva="
					+ contaAtiva + "]";
		}
		
		
		
		
		
	
	}

		

	


