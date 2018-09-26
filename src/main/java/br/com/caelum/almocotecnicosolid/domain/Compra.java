package br.com.caelum.almocotecnicosolid.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity @Table(name = "compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Cliente cliente;

    @OneToMany
    private List<Produto> produtos;

    @Enumerated(STRING)
    private CompraStatus status;

    public Compra(Cliente cliente, List<Produto> produtos, CompraStatus status) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.status = CompraStatus.AGUARDANDO;
    }

    Compra() {}

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void finaliza() {
        status = CompraStatus.FINALIZADA;
    }
}
