package com.jurineide.escola.converter;

import com.jurineide.escola.dtos.AlunoResponseDTO;
import com.jurineide.escola.entities.Alunos;
import org.springframework.stereotype.Component;

@Component
public class AlunoConverter {

    public AlunoResponseDTO toDto(Alunos alunos){
        AlunoResponseDTO alunoResponseDTO = new AlunoResponseDTO();
        alunoResponseDTO.setId(alunos.getId());
        alunoResponseDTO.setNome(alunos.getNome());
        alunoResponseDTO.setDataNascimento(alunos.getDataNascimento());
        return alunoResponseDTO;
    }
}
