package br.com.ecomanager;

import java.util.ArrayList;
import java.util.List;

public class Instituicao {

	private static int next_id = 0;
	
	private int id;
	private String nome;
	private ArrayList <Bloco> Blocos;
//	endereco
	
	List <Bloco> ArrayList = new ArrayList <Bloco>();
	
	public Instituicao(String nome, java.util.ArrayList<Bloco> blocos, List<Bloco> arrayList) {
		super();
		this.id = ++next_id;
		this.nome = nome;
		Blocos = blocos;
		ArrayList = arrayList;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Bloco> getBlocos() {
		return Blocos;
	}

	public void setBlocos(ArrayList<Bloco> blocos) {
		Blocos = blocos;
	}

	public List<Bloco> getArrayList() {
		return ArrayList;
	}
	
	
}
