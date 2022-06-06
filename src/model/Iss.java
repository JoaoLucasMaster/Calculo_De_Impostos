package model;

public class Iss extends Imposto {
	private double valorServico;
	
	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public Iss(String nome, String esfera)
	{
		super(nome,esfera);
	}
	
	@Override
	public double calculaImposto()
	{
		return this.getAliquota()*valorServico;
	}
}
