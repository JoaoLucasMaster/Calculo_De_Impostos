package model;

public class Iof extends Imposto{
	
	private double valorOperacao;
	private double valor;
	private double diasCorridos;
	
	
	public double getValorOperacao() {
		return valorOperacao;
	}


	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public double getDiasCorridos() {
		return diasCorridos;
	}


	public void setDiasCorridos(double diasCorridos) {
		this.diasCorridos = diasCorridos;
	}


	public Iof(String nome, String esfera)
	{
		super(nome,esfera);
	}
	
	@Override
	public double calculaImposto()
	{
		return (valorOperacao*0.38)+(valor*0.00137*diasCorridos);
	}
}
