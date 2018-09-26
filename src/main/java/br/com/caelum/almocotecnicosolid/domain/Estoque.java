package br.com.caelum.almocotecnicosolid.domain;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = LAZY)
    @MapsId
    private Produto produto;

    private Integer quantidade;

    public Estoque(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    Estoque() {}

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void decrementa(int num) {
        quantidade -= num;
    }

}
