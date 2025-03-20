package com.example.Escola.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    private String nome;
    private int numeroSala;

    @OneToOne //1 pra 1 *1ª num referente a classe, tabela que nós estamos; 2º num referente ao destino
    @JoinColumn(name = "idProfessor", referencedColumnName = "idProfessor")
    private Professor professor;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Aluno> alunos;

    public Curso(){
    }

    public Curso(Long idCurso, String nome, int numeroSala) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.numeroSala = numeroSala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
