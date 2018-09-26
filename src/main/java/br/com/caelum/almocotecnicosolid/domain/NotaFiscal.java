package br.com.caelum.almocotecnicosolid.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity @Table(name = "notas_fiscais")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Cliente cliente;

    @OneToOne
    private Compra compra;

    private BigDecimal valorFinal;

    public NotaFiscal(Cliente cliente, Compra compra) {
        this.cliente = cliente;
        this.compra = compra;
    }

    NotaFiscal() {}

    public Long getId() {
        return id;
    }

    public Compra getCompra() {
        return compra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }
}
