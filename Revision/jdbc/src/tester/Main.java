package tester;

import bean.Anime;
import dao.Operations;

public class Main {
	public static void main(String[] args) {
		Operations.insertAnimeData(new Anime("Dragon Ball Z","Goku","Most popular","Japan"));
		//Operations.insertAnimeData(new Anime("Detective Conan","Conan","Most popular","Japan"));
		//Operations.deleteAnimeFromDatabase(1);
		//Operations.updateAnimeById(2, new Anime("Detective Conan","Conan","Most Popular","Japan"));
		Operations.fetchAllAnime();
		
	}

}
