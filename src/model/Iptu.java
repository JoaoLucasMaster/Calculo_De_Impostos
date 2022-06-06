package model;

public class Iptu extends Imposto{
	private double valorMetroQuadroConstruido;
	private double valorMetroQuadradoRegiao;
	
	
	public double getValorMetroQuadroConstruido() {
		return valorMetroQuadroConstruido;
	}

	public void setValorMetroQuadroConstruido(double valorMetroQuadroConstruido) {
		this.valorMetroQuadroConstruido = valorMetroQuadroConstruido;
	}

	public double getValorMetroQuadradoRegiao() {
		return valorMetroQuadradoRegiao;
	}

	public void setValorMetroQuadradoRegiao(double valorMetroQuadradoRegiao) {
		this.valorMetroQuadradoRegiao = valorMetroQuadradoRegiao;
	}

	public Iptu(String nome, String esfera)
	{
		super(nome,esfera);
	}
	
	@Override
	public double calculaImposto()
	{
		return this.getAliquota()*(valorMetroQuadroConstruido*valorMetroQuadradoRegiao);
	}
}
