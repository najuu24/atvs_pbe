package com.example.Escola.Controller;


import com.example.Escola.Entity.Curso;
import com.example.Escola.Repository.CursoRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public ResponseEntity<List<Curso>> getAll() {
        return ResponseEntity.ok(cursoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Curso> create (@RequestBody Curso curso) {
        Curso cursoBd = cursoRepository.save(curso);
        return ResponseEntity.ok(curso);

    }
}
