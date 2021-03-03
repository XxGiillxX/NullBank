package model;

public class Emprestimo extends Conta{
	
	private double mes, juros, saldo;

	public double getMes() {
		return mes;
	}

	public void setMes(double mes) {
		this.mes = mes;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	void emprestimo(Conta destino, double valor, double vezes) { 
			if (vezes > 0 && vezes <= 12) {
				setMes(valor / vezes);
				setJuros((getMes() * 2.5) / 100);
				System.out.printf("Valor Contratado: R$ %.2f", valor);
				System.out.println(" ");
				System.out.printf("Valor da parcela, " + vezes + "x de: R$ %.2f", (getJuros() + getMes()));
				System.out.println(" ");
				System.out.printf("Valor total de juros a ser pago: R$ %.2f", (getJuros() * vezes));
				System.out.println(" ");
				System.out.printf("Valor total a ser depositado é de: R$ %.2f", ((getJuros() * vezes) + valor));
				this.transferir(destino, valor);
				System.out.println(" ");
				System.out.println("Parabéns o serviço foi contratado com sucesso, boa sorte!");

			} else if (vezes > 12 && vezes <= 24) {
				setMes(valor / vezes);
				setJuros((getMes() * 3.5) / 100);
				System.out.printf("Valor Contratado: R$ %.2f", valor);
				System.out.println(" ");
				System.out.printf("Valor da parcela, " + vezes + "x de: R$ %.2f", (getJuros() + getMes()));
				System.out.println(" ");
				System.out.printf("Valor total de juros a ser pago: R$ %.2f", (getJuros() * vezes));
				System.out.println(" ");
				System.out.printf("Valor total a ser depositado é de: R$ %.2f", ((getJuros() * vezes) + valor));
				this.transferir(destino, valor);
				System.out.println(" ");
				System.out.println("Parabéns o serviço foi contratado com sucesso, boa sorte!");
			} else {
				setMes(valor / vezes);
				setJuros((getMes() * 4.5) / 100);
				System.out.printf("Valor Contratado: R$ %.2f", valor);
				System.out.println(" ");
				System.out.printf("Valor da parcela, " + vezes + "x de: R$ %.2f", (juros + mes));
				System.out.println(" ");
				System.out.printf("Valor total de juros a ser pago: R$ %.2f", (juros * vezes));
				System.out.println(" ");
				System.out.printf("Valor total a ser depositado é de: R$ %.2f", ((juros * vezes) + valor));
				this.transferir(destino, valor);
				System.out.println(" ");
				System.out.println("Parabéns o serviço foi contratado com sucesso, boa sorte!");
			}
	}
	
	
	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
		

	}

	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;

	}

	@Override
	public void transferir(Conta destino, double valor) {
		this.saldo = saldo-valor;
		destino.depositar(valor);
		
	}

	@Override
	public void exibirDados() {
		System.out.println("Nome :" + this.getPessoa().getNome());
		System.out.println("CPF: "+ this.getPessoa().getCPF());
		System.out.println("Número : "+this.getNumero());
		System.out.println("Agência: "+this.getAgencia());
		
	}

}
