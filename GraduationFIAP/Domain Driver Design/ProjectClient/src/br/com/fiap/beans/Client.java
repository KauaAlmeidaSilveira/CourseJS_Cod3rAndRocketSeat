package br.com.fiap.beans;

public class Client {

    private String name;
    private Integer age;
    private Double vlrConsult;

    public Client(String name, Integer age, Double vlrConsult) {
        this.name = name;
        this.age = age;
        this.vlrConsult = vlrConsult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getVlrConsult() {
        return vlrConsult;
    }

    public void setVlrConsult(Double vlrConsult) {
        this.vlrConsult = vlrConsult;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Value consult: " + vlrConsult;
    }
}
