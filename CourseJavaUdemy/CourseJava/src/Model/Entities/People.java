package Model.Entities;

import java.time.Instant;
import java.util.Objects;

public class People {

    private String nome;
    private int idade;
    private double altura;
    private double[] notas = new double[2];
    private String email;
    private Instant date;

    public People(String nome, Instant date) {
        this.nome = nome;
        this.date = date;
    }

    public People(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public People(String nome, int idade, double altura, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.notas = notas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String toString() {
        return "People nome=" + nome + ", idade=" + idade + ", altura=" + altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(nome, people.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
