package model;

public class ContaCorrente extends Conta {

		private double saldo;
		

		@Override
		public void depositar(double valor) {
			this.saldo = saldo + valor;
			
		}



		@Override
		public void transferir(Conta destino, double valor) {
			this.saldo = saldo - valor;
			destino.depositar(valor);
			
		}

		@Override
		public void sacar(double valor) {
			this.saldo = saldo - valor;
		}

		@Override
		public void exibirDados() {
			System.out.println("Nome :" + this.getPessoa().getNome());
			System.out.println("CPF: "+ this.getPessoa().getCPF());
			System.out.println("Saldo Conta Corrente: R$ " + this.getSaldo());
			System.out.println("Número : "+this.getNumero());
			System.out.println("Agência: "+this.getAgencia());
		}
		
		
		
		public double getSaldo() {
			return saldo;
		}
		
		
		

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}



		
		
}
