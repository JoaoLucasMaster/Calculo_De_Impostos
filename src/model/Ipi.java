package model;

public class Ipi extends Imposto{
	private double baseCalculo; 
	private double valorProduto;
	private double frete;
	private double seguro;
	
	public double getBaseCalculo() {
		return baseCalculo;
	}



	public void setBaseCalculo(double baseCalculo) {
		this.baseCalculo = baseCalculo;
	}



	public double getValorProduto() {
		return valorProduto;
	}



	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}



	public double getFrete() {
		return frete;
	}



	public void setFrete(double frete) {
		this.frete = frete;
	}



	public double getSeguro() {
		return seguro;
	}



	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}



	public Ipi(String nome, String esfera) 
	{
		super(nome,esfera);
	}
		
	@Override
	public double calculaImposto()
	{
		baseCalculo = (seguro+frete+valorProduto);
		return baseCalculo*0.0015;
	}
}
