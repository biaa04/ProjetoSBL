package model;

public class Javabeans {
	private String idbanda;
	private String nome;
	private String genero;
	
	
	
	public Javabeans(String idbanda, String nome, String genero) {
		super();
		this.idbanda = idbanda;
		this.nome = nome;
		this.genero = genero;
	}
	public Javabeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getIdbanda() {
		return idbanda;
	}
	public void setIdbanda(String idbanda) {
		this.idbanda = idbanda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

}
