package org.ufc.quixada;

public class Produto {
	
	private int codigo;
	private String descricao;
	private double vl_compra;
	private double custo;
	private double margem_lucro;
	private int qtd_estoque;
	
	public void compra(int quant) {
		qtd_estoque = qtd_estoque + quant;
	}
	
	public void venda(int quant) {
		qtd_estoque = qtd_estoque - quant;
	}
	
	public double calculaPrecoVenda() {
		return vl_compra + custo + margem_lucro * (vl_compra + custo);
	}
	
	public double getVl_Compra() {
		return this.vl_compra;
	}
	
	public void setVl_Compra(double vl_compra) {
		this.vl_compra = vl_compra;
	}
	
	public double getCusto() {
		return this.custo;
	}
	
	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	public double getMargem_Lucro() {
		return this.margem_lucro;
	}
	
	public void setMargem_Lucro(double margem_lucro) {
		this.margem_lucro = margem_lucro;
	}

	public int Codigo(int codigo) {
		return codigo;
	}

	public String Descricao(String descricao) {
		return descricao;
	}

	public int Qtd_Estoque(int qtd_estoque) {
		return qtd_estoque;
	}
}
