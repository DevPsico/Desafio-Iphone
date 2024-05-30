package main;

import model.Aparelho;
import model.Navegador;
import model.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, Aparelho, Navegador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone cel = new Iphone();
			
		System.out.println(cel.tocar());
		System.out.println(cel.pausar());
		System.out.println(cel.selecionarMusica());
		
		
		System.out.println(cel.ligar());
		System.out.println(cel.atender());
		System.out.println(cel.iniciarCorreioVoz());
		
		
		System.out.println(cel.exibirPagina());
		System.out.println(cel.adicionarNovaAba());
		System.out.println(cel.atualizarPagina());

	}
	
	//METODOS DA CLASSE REPRODUTORMUSICAL
	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "Tocando";
	}

	@Override
	public String pausar() {
		// TODO Auto-generated method stub
		return "M�sica pausada";
	}

	@Override
	public String selecionarMusica() {
		// TODO Auto-generated method stub
		return "Selecionando M�sica";
	}
	
	
	
	//METODOS DA CLASSE APARELHO
	@Override
	public String ligar() {
		// TODO Auto-generated method stub
		return "Efetuando liga��o";
	}

	@Override
	public String atender() {
		// TODO Auto-generated method stub
		return "Atendendo liga��o";
	}

	@Override
	public String iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		return "Iniciando Correio de voz";
	}
	
	
	
	//METODOS DA CLASSE NAVEGADOR
	@Override
	public String exibirPagina() {
		// TODO Auto-generated method stub
		return "Exibindo p�gina";
	}

	@Override
	public String adicionarNovaAba() {
		// TODO Auto-generated method stub
		return "Adicionando nova aba";
	}

	@Override
	public String atualizarPagina() {
		// TODO Auto-generated method stub
		return "Atualizando p�gina";
	}
}
