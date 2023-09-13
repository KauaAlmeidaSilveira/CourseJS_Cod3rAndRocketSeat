package Model.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Client {
	
	private String name;
	private String email;
	private LocalDate birthDate;
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String showInfoClient() {
		return "Client: " + this.name + " (" + fmt.format(birthDate) + ") - " + this.email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Client client = (Client) o;
		return Objects.equals(name, client.name) && Objects.equals(email, client.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, email);
	}
}
