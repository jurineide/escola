package com.jurineide.escola.services;

import com.jurineide.escola.controllers.AlunoController;
import com.jurineide.escola.converter.AlunoConverter;
import com.jurineide.escola.dtos.AlunoRequestDTO;
import com.jurineide.escola.dtos.AlunoResponseDTO;
import com.jurineide.escola.entities.Alunos;
import com.jurineide.escola.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    @Autowired
    AlunoConverter alunoConverter;

    public AlunoResponseDTO save(AlunoRequestDTO dto) {
        var response =  alunoRepository.save(new Alunos(
                dto.getNome(),
                dto.getDataNascimento()
        ));
        var alunoResponseDTO = alunoConverter.toDto(response);

        return alunoResponseDTO;
    }

    public Optional<Alunos> getById(Long id){
        var aluno = alunoRepository.findById(id);

        return aluno;
    }

    public List<Alunos> findAll(){
        var alunos = alunoRepository.findAll();
        return alunos;
    }


}
