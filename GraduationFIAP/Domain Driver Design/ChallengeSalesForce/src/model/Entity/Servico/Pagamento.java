package model.Entity.Servico;

import java.time.LocalDateTime;
import java.util.Objects;

public class Pagamento {

    private Long id;
    private String descricao;
    private LocalDateTime dataPagamento;
    private Double valor;
    private String status;
    private String metodo;

    public Pagamento(String descricao, LocalDateTime dataPagamento, Double valor, String status, String metodo) {
        this.descricao = descricao;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.status = status;
        this.metodo = metodo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(id, pagamento.id) && Objects.equals(descricao, pagamento.descricao) && Objects.equals(dataPagamento, pagamento.dataPagamento) && Objects.equals(valor, pagamento.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, dataPagamento, valor);
    }

    @Override
    public String toString() {
        return "\nPagamento " + "\n" +
                "Id: "+ id + "\n" +
                "Descrição: "+ descricao + "\n" +
                "Data do pagamento: " + dataPagamento + "\n" +
                "Valor: " + valor + "\n" +
                "Status: " + status + "\n" +
                "Metodo: " + metodo + "\n";
    }
}
