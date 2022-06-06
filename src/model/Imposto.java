package model;

public abstract class Imposto {
	
	private String nome;
	private String esfera;
	private double aliquota;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsfera() {
		return esfera;
	}

	public void setEsfera(String esfera) {
		this.esfera = esfera;
	}
	
	public Imposto(String nome, String esfera) {
		this.nome = nome;
		this.esfera = esfera;
	}
	
	public void setAliquota(double aliquota)
	{
		this.aliquota = aliquota;
	}
	
	public double getAliquota()
	{
		return this.aliquota;
	}
	
	 public abstract double  calculaImposto(); 
}
