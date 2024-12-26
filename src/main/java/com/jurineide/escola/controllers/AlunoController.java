package com.jurineide.escola.controllers;

import com.jurineide.escola.dtos.AlunoRequestDTO;
import com.jurineide.escola.dtos.AlunoResponseDTO;
import com.jurineide.escola.entities.Alunos;
import com.jurineide.escola.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlunoController {

    @Autowired
    AlunoService alunoService;

   @PostMapping("/postAluno")
    public ResponseEntity<AlunoResponseDTO>saveAluno(@RequestBody AlunoRequestDTO alunoRequestDTO){
       return ResponseEntity.ok(alunoService.save(alunoRequestDTO));
   }

    @GetMapping("/getById/{id}")
    public Optional<Alunos> findById(@PathVariable Long id){
        var response = alunoService.getById(id);
        return response;
    }

    @GetMapping("/findAll")
    public List<Alunos> findAll(){
        var response = alunoService.findAll();
        return response;
    }


}
