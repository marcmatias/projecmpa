package br.com.ecomanager;
import java.util.ArrayList;
import java.util.List;

import br.com.ecomanager.enumerator.TipoSala;

public class Sala {

	private static int next_id = 0;
	
	private int id;
	private int numero;
	private TipoSala tiposala;
	
	public Sala(int numero, TipoSala tiposala) {
//		super();
		this.id = ++next_id;
		this.numero = numero;
		this.tiposala = tiposala;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoSala getTiposala() {
		return tiposala;
	}

	public void setTiposala(TipoSala tiposala) {
		this.tiposala = tiposala;
	} 
	
	
}
