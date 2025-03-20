package com.example.Escola.Controller;

import com.example.Escola.Entity.Aluno;
import com.example.Escola.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    @PostMapping
    public ResponseEntity<Aluno> created(@RequestBody Aluno aluno) {
        Aluno alunoBd = alunoRepository.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
    }
}
