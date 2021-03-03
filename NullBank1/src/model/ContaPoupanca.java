package model;

public class ContaPoupanca extends Conta{

private double saldo;
	
	

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void bonus() {
		if(getContaAtiva() == true) {
			this.depositar(50);
			System.out.println("Saldo da Conta Poupan�a: R$ " + getSaldo());
		} else {
			System.err.println("� necess�rio ter conta NullBank ativa!");
		}
	}

	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
		
	}

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
	public void exibirDados() {
		System.out.println("Nome :" + this.getPessoa().getNome());
		System.out.println("CPF: "+ this.getPessoa().getCPF());
		System.out.println("Saldo Conta Poupan�a: R$ " + this.getSaldo());
		System.out.println("N�mero : "+this.getNumero());
		System.out.println("Ag�ncia: "+this.getAgencia());
		
	}
}
