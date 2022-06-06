package view;

import model.Icms;
import model.Iof;
import model.Ipi;
import model.Iptu;
import model.Ipva;
import model.Iss;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Iof primeiroIof = new Iof("Compra de produto","Federal");
		primeiroIof.setValor(38);
		primeiroIof.setDiasCorridos(5);
		primeiroIof.setValorOperacao(45);
		primeiroIof.setNome("Carrinho do Batman");
		System.out.format("Produto: %s\nValor:%.2f\nDias corridos:%.2f\nValor da operação:%.2f\n",primeiroIof.getNome(),primeiroIof.getValor(),primeiroIof.getDiasCorridos(),primeiroIof.getValorOperacao());
		System.out.format("O valor do imposto é de:%.4f\n",primeiroIof.calculaImposto());
		
		System.out.println("");
		
		Ipi primeiroIpi = new Ipi("Compra de produto","Federal");
		primeiroIpi.setValorProduto(50);
		primeiroIpi.setFrete(30);
		primeiroIpi.setSeguro(100);
		primeiroIpi.setNome("Lava Louças");
		System.out.format("Produto: %s\nValor do produto: %.2f\nValor do frete: %.2f\nValor do seguro: %.2f\n",primeiroIpi.getNome(),primeiroIpi.getValorProduto(),primeiroIpi.getFrete(),primeiroIpi.getSeguro());
		System.out.format("O valor do Ipi é de: %.2f",primeiroIpi.calculaImposto());
		
		System.out.println("");
		System.out.println("");
		
		Icms primeiroIcms = new Icms("Viagem","Estadual");
		primeiroIcms.setAliquota(0.12);
		primeiroIcms.setDestino("São Paulo -> Minas Gerais");
		primeiroIcms.setValor(60);
		primeiroIcms.setNome("Bate e volta");
		System.out.format("Viagem: %s\nDestino: %s\nValor: %.2f\nAliquota: %.2f\n",primeiroIcms.getNome(),primeiroIcms.getDestino(),primeiroIcms.getValor(),primeiroIcms.getAliquota());
		System.out.format("O valor do Icms: %f",primeiroIcms.calculaImposto());
		
		System.out.println("");
		System.out.println("");
		
		Ipva primeiroIpva = new Ipva ("Compra de carro","Estadual");
		primeiroIpva.setAliquota(0.10);
		primeiroIpva.setValor(20000);
		primeiroIpva.setNome("Carro gol Voskwagem");
		System.out.format("Nome: %s\nValor: %.2f\nAliquota: %.2f\n",primeiroIpva.getNome(),primeiroIpva.getValor(),primeiroIpva.getAliquota());
		System.out.format("O valor do Ipva: %.2f",primeiroIpva.calculaImposto());
		
		System.out.println("");
		System.out.println("");
		
		Iptu primeiroIptu = new Iptu("Minha casa","Municipal");
		primeiroIptu.setAliquota(0.05);
		primeiroIptu.setValorMetroQuadradoRegiao(5);
		primeiroIptu.setValorMetroQuadroConstruido(64);
		System.out.format("Nome: %s\nMetros quadrados Construidos: %.2f\nValor metro quadrado nesta região: %.2f\nAliquota: %.2f\n",primeiroIptu.getNome(),primeiroIptu.getValorMetroQuadroConstruido(),primeiroIptu.getValorMetroQuadradoRegiao(),primeiroIptu.getAliquota());
		System.out.format("O valor do Iptu: %.2f",primeiroIptu.calculaImposto());
		
		System.out.println("");
		System.out.println("");
		
		Iss primeiroIss = new Iss("Limpeza de Jardim","Municipal");
		primeiroIss.setAliquota(0.15);
		primeiroIss.setValorServico(400);
		System.out.format("Serviço: %s\nAliquota: %.2f\nValor do serviço: %.2f\n",primeiroIss.getNome(),primeiroIss.getAliquota(),primeiroIss.getValorServico());
		System.out.format("O valor do Iss é de: %.2f",primeiroIss.calculaImposto());
		
		
	}

}
