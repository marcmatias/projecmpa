package com.eco.manager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Testes {

	@Before
	public void setUp(){
		//Chamado antes de cada teste pra oferecer pré-condições
	}
	
	@After
	public void tearDown(){
		//Chamado depois de cada teste pra realizar qualquer ajuste
	}

	@Test
	public void testInputSala(){
		try {
			Sala sala = new Sala();
			sala.setNome("EVA275");
			Consumo consumo = new Consumo();
			consumo.setKwh("1000");
			consumo.setData("20/02/2018");
			sala.setConsumo(consumo);
			Sistema.getInstance().cadastrarSala(sala);
		} catch ( IllegalArgumentException esperada ){
			//se caiu aqui, está certo;
		}
		
	}

}
