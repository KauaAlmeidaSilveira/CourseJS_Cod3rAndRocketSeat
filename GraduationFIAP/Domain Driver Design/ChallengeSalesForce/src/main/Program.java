package main;

import model.Entity.Cadastro.Conta;
import model.Entity.Cadastro.Empresa;
import model.Entity.Cadastro.Endereco;
import model.Entity.Cadastro.Pessoa;
import model.Entity.Servico.Pagamento;
import model.Entity.Servico.Servico;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua Josué Carmino Bruno", "São Paulo", "SP", "03909080", "BR");
        Endereco end2 = new Endereco("Rua Josué Carmino Bruna", "São Paulo", "SP", "03909080", "BR");

        Empresa emp = new Empresa("UniDrummond", "Técnico de TI");

        Pessoa p1 = new Pessoa("Kauã Almeida Silveira", "(11) 96368-9880", "56.651.812-0", end1, emp);
        Pessoa p2 = new Pessoa("Kauã Almeida Silveira", "Kiwi", "0000-0000", "(11) 96368-9880", "56.651.812-0", end2, emp);

        p1.setApelido("Kiwi");

        p1.setConta(new Conta(p1.getApelido()+"@force.com", "kaua@email.com", "123321"));
        p2.setConta(new Conta(p2.getApelido()+"@force.com", "kaua@email.com", "123321"));

        Pagamento pagamento = new Pagamento("Pagamento service IA", LocalDateTime.now(), 1500.00, "Processando", "Cartão de crédito");

        p1.getConta().addServico(new Servico("IA Einstein", "Serviço dedicado a IA", "IA", pagamento));
        p2.getConta().addServico(new Servico("IA Einstein", "Serviço dedicado a IA", "IA", pagamento));

        System.out.println(p1);
        //System.out.println(p2);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Pessoa 1 é igual a 2 ? " + (p1.equals(p2) ? "Sim": "Não"));
        System.out.println("Os enderecos são os mesmos ? " + (end1.equals(end2) ? "Sim": "Não"));
        System.out.println("As contas são as mesmas ? " + (p1.getConta().equals(p2.getConta()) ? "Sim": "Não"));

    }
}
