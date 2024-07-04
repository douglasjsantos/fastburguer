/*
package br.com.douglas.fastburguer.Hamburgueria.Fast.Domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TBL_LANCHES")
public class Lanche {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private String nome;
    private String descricao;
    private String ingredientes;
    private Double preco;

    public Lanche() {
    }

    public Lanche(Long id, String nome, String descricao, String ingredientes, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lanche lanche = (Lanche) o;
        return Objects.equals(id, lanche.id) && Objects.equals(nome, lanche.nome) && Objects.equals(descricao, lanche.descricao) && Objects.equals(ingredientes, lanche.ingredientes) && Objects.equals(preco, lanche.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, ingredientes, preco);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

 */
