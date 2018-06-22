package com.eco.manager;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;


public class ConsoleUI {
		
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		exibirMenuPrincipal();
	}
		
	private static void exibirMenuPrincipal() throws ParseException {
		
		System.out.println("O que deseja fazer?");
		System.out.println("(1) Adicionar nova sala;");
		System.out.println("(2) Listar todos as salas;");
		System.out.println("(3) Remover sala por id;");
		System.out.println("(4) Sair;");
		
		int opcao = scanner.nextInt();
		scanner.nextLine();
		
		switch ( opcao ) {
		case 1:
			adicionarSala();
			exibirMenuPrincipal();
			break;
		case 2:
			listarSalas();
			exibirMenuPrincipal();
			break;
		case 3:
			removerSala();
			exibirMenuPrincipal();
			break;
		case 4:
			System.out.println("Adeus!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Opcao \"(" + opcao + ")\" invalida! \nTente novamente!"  );
			break;
		}
		
	}
		

	private static void adicionarSala() throws ParseException {
		
		System.out.print("Digite o nome da sala: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o Kilowatshora: ");
		String kwh = scanner.nextLine();
		
		System.out.print("Digite o data: ");

		String data = scanner.nextLine();
		
		Sala sala = new Sala();
		sala.setNome(nome);
		
		Consumo consumo = new Consumo();
		consumo.setKwh(kwh);
		consumo.setData(data);
		
		sala.setConsumo(consumo);
		
		Sistema.getInstance().cadastrarSala(sala);
	}

	private static void listarSalas() {
		List<Sala> salas = Sistema.getInstance().obterSalas();
		
		for (Sala s : salas) {
			System.out.print("ID: " + s.getId() + " - ");
			System.out.print("Nome: " + s.getNome() + " - ");
			System.out.print("Consumo: (" + s.getConsumo().getKwh() + ") ");
			System.out.println(s.getConsumo().getKwh());
		}
	}

	private static void removerSala() {
		
		System.out.print("Digite o ID do contato a ser removido: ");
		Long id = scanner.nextLong();
		scanner.nextLine();
		
		Sala c = new Sala();
		c.setId(id);
		Sistema.getInstance().removerContato(c);
	}		
	
}
