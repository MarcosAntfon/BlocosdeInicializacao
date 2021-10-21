package BlocosdeInicializacaoDominio;

import java.util.Iterator;

public class Anime {
	private String nome;
	private int[] episodios;
	
	// 1º Alocado espaço em memoria pra objeto
	//2º cada atributo de classe e criado e inicializado com valores default ou o quer for passado.
	//3º bloco de inicialização e executado
	//4º construtor e executado
	
	{
		System.out.println("Dentro do bloco de inicialização");
		episodios= new int[100];
		for (int i = 0; i < episodios.length; i++) {
			episodios[i]=i+1;
		}
	}
	
	public Anime() {
			
		for(int episodios: this.episodios) {
		System.out.println(episodios + " ");
		}
		System.out.println();
	}

	public Anime(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int[] getEpisodios() {
		return episodios;
	}


	public void setEpisodios(int[] episodios) {
		this.episodios = episodios;
	}


}
	
