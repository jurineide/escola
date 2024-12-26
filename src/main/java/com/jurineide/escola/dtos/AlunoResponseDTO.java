package com.jurineide.escola.dtos;

import com.jurineide.escola.entities.Alunos;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlunoResponseDTO {
    private long id;
    private String nome;
    private String dataNascimento;

    public static AlunoResponseDTO toDto(Alunos alunos){
        AlunoResponseDTO alunoResponseDTO = new AlunoResponseDTO();
        alunoResponseDTO.setId(alunos.getId());
        alunoResponseDTO.setNome(alunos.getNome());
        alunoResponseDTO.setDataNascimento(alunos.getDataNascimento());
        return alunoResponseDTO;
    }

}
