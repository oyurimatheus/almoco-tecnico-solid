package br.com.caelum.almocotecnicosolid.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produtos;

    private BigDecimal valorFinal;

    public NotaFiscal(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    NotaFiscal() {}

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }
}
