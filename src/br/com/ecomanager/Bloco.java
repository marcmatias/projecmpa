package br.com.ecomanager;

import java.util.ArrayList;
import java.util.List;

public class Bloco {

	private static int next_id = 0;
	
	private int id;
	private String Localizacao;
	
	private ArrayList <Sala> list = new ArrayList<Sala>();
	List <Sala> ArrayList = new ArrayList <Sala>();
	
	public Bloco(String localizacao, ArrayList<Sala> list) {
		super();
		this.id = ++next_id;
		Localizacao = localizacao;
		this.list = list;
	}

	public String getLocalizacao() {
		return Localizacao;
	}

	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}

	public ArrayList<Sala> getList() {
		return list;
	}

	public void setList(ArrayList<Sala> list) {
		this.list = list;
	}
	
	public List<Sala> getArrayList() {
		return ArrayList;
	}
	
}
