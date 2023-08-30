package br.com.fiap.main;

import br.com.fiap.beans.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter client name: ");
        String name = sc.nextLine();

        System.out.print("Enter client age: ");
        int age = sc.nextInt();

        System.out.print("Enter the value of consult: ");
        double vlrConsult = sc.nextDouble();

        Client client = new Client(name, age, vlrConsult);

        System.out.println("\nINFO CLIENT: ");

        System.out.println(client.toString());

        sc.close();

    }
}
