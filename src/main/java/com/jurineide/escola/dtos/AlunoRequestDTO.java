package com.jurineide.escola.dtos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AlunoRequestDTO {
    private String nome;
    private String dataNascimento;

}
