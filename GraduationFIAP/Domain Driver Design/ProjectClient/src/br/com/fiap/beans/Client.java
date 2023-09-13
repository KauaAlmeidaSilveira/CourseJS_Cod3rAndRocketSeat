package br.com.fiap.beans;

public class Client {

    private String name;
    private String cpf;
    private Address address;
    private String email;
    private Integer age;

    public Client(String name, String cpf, Address address, String email, Integer age) {
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
    public String toString() {
        return "Name: " + name + "\n" +
               "CPF: " + cpf + "\n" +
               "Email: " + email + "\n" +
               "Age: " + age;
    }

}
