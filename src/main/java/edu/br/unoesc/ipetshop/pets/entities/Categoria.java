package edu.br.unoesc.ipetshop.pets.entities;


import javax.persistence.*;

@Entity
@Table(name = "produto_categoria")
public class Categoria extends  EntidadeAbstrata{


    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
