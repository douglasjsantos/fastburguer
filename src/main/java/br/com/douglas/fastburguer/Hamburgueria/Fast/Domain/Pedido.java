/*

package br.com.douglas.fastburguer.Hamburgueria.Fast.Domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "TBL_PEDIDOS")
public class Pedido {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lanche_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "lanche_id", nullable = false)
    private Lanche lanche;
    private Double valor;
    private LocalDateTime hora;

    public Pedido() {
    }

    public Pedido(Long id, Cliente cliente, Lanche lanche, Double valor, LocalDateTime hora) {
        this.id = id;
        this.cliente = cliente;
        this.lanche = lanche;
        this.valor = valor;
        this.hora = hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id) && Objects.equals(cliente, pedido.cliente) && Objects.equals(lanche, pedido.lanche) && Objects.equals(valor, pedido.valor) && Objects.equals(hora, pedido.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cliente, lanche, valor, hora);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public void setLanche(Lanche lanche) {
        this.lanche = lanche;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
*/