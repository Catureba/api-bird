package com.example.apibirds.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="TB_BIRD")
public class Bird implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String image;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}
}
