package bean;

public class Anime {
	private int animeId;
	private String name;
	private String famousCharacter;
	private String popularity;
	private String country;
	public Anime(int animeId, String name, String famousCharacter, String popularity, String country) {
		super();
		this.animeId = animeId;
		this.name = name;
		this.famousCharacter = famousCharacter;
		this.popularity = popularity;
		this.country = country;
	}
	public Anime(String name, String famousCharacter, String popularity, String country) {
		super();
		this.name = name;
		this.famousCharacter = famousCharacter;
		this.popularity = popularity;
		this.country = country;
	}
	public Anime() {
		super();
	}
	public int getAnimeId() {
		return animeId;
	}
	public void setAnimeId(int animeId) {
		this.animeId = animeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamousCharacter() {
		return famousCharacter;
	}
	public void setFamousCharacter(String famousCharacter) {
		this.famousCharacter = famousCharacter;
	}
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Anime [animeId=" + animeId + ", name=" + name + ", famousCharacter=" + famousCharacter + ", popularity="
				+ popularity + ", country=" + country + "]";
	}

}
