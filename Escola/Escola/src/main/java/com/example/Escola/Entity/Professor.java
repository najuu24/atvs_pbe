package com.example.Escola.Entity;

import jakarta.persistence.*;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProfessor;
    private String nome;
    private String cpf;

    @OneToOne(mappedBy = "professor")//1 professor para 1 curso; já está mapeado na ligação "Professor"// (linha 14 classe curso)
    private Curso curso;

    public Professor(){
    }

    public Professor(Long idProfessor, String cpf, String nome) {
        this.idProfessor = idProfessor;
        this.cpf = cpf;
        this.nome = nome;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
