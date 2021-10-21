package BlocosdeInicializacaoTest;

import BlocosdeInicializacaoDominio.Anime;

public class AnimeTest {
	public static void main(String[] args) {
		
	Anime anime = new Anime();
	for(int episodios : anime.getEpisodios()) {
		System.out.println(episodios + " ");
		}
	}
}
