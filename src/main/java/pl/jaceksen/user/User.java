package pl.jaceksen.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private String id;
	private String imie;
	private String nazwisko;
	
	public User() {}

	public User(String id, String imie, String nazwisko) {
		super();
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	

}
