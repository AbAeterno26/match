package nl.youngcapital.match.model;

import jakarta.persistence.*;

@MappedSuperclass
public class Persoon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String naam;

	private String wachtwoord;

	private String email;
	private String foto;
	private String telefoon;
	
	public long getId() {
		return id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getTelefoon() {
		return telefoon;
	}
	public void setTelefoon(String telefoon) {
		this.telefoon = telefoon;
	}
}
