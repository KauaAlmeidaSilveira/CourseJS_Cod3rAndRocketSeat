package ArrayList;

import java.util.Locale;
import java.util.Scanner;

import Model.Entities.People;

public class AppPeople {
	
// 	Neste APP juntei 3 desafios são eles:
	
//	- Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//	tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//	bem como os nomes dessas pessoas caso houver. 
//	- Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//	devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//	da pessoa mais velha. 
//	- Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//	no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//	os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//	igual a 6.0 (seis). 


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("How many people will be inserted?");
		int manyPeople = sc.nextInt();

		People[] people = new People[manyPeople];

		for (int i = 0; i < manyPeople; i++) {
			System.out.printf("Dados da %dº pessoa: %n", (i + 1));
			sc.nextLine();
			System.out.printf("Nome: ");
			String nome = sc.nextLine();
			System.out.printf("Idade: ");
			int idade = sc.nextInt();
			System.out.printf("Altura: ");
			double altura = sc.nextDouble();
			System.out.printf("Nota 1: ");
			double nota1 = sc.nextDouble();
			System.out.printf("Nota 2: ");
			double nota2 = sc.nextDouble();
			
			double[] notas = new double[2];
			notas[0] = nota1;
			notas[1] = nota2;

			people[i] = new People(nome, idade, altura, notas);
		}

		double alturaMedia = 0;
		int peopleUnderAge = 0;

		for (int i = 0; i < people.length; i++) {
			alturaMedia += people[i].getAltura();
			if (people[i].getIdade() < 16) {
				peopleUnderAge++;
			}
		}

		System.out.printf("Altura Média: %.2f%n", (alturaMedia / manyPeople));

		System.out.printf("Pessoas com menos de 16 anos: %d%s%n", ((peopleUnderAge * 100) / people.length), "%");

		int olderAge = people[0].getIdade();
		int positionOlderAge = 0;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getIdade() < 16) {
				System.out.println(people[i].getNome());
			}
			if(olderAge < people[i].getIdade()) {
				olderAge = people[i].getIdade();
				positionOlderAge = i;
			}
		}
	
		
		System.out.printf("Pessoa mais velha: %s%n", people[positionOlderAge].getNome());
		
		System.out.printf("Aprovados: %n");
		
		for(int i =0; i<people.length; i++) {
			String nome = alunoAprovado(people[i]);
			
			if(nome != null) {
				System.out.println(nome);
			}
		}
		
		
		sc.close();
	}
	
	public static String alunoAprovado(People people) {
		double[] notas = people.getNotas();
		double notasTotal = 0;
		for(int i = 0; i<notas.length; i++) {
			notasTotal += notas[i];
		}
		if((notasTotal/2) >= 6) {
			return people.getNome();
		}
		return null;
	}

}
